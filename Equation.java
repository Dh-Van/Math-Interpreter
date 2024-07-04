import java.util.ArrayList;
import java.util.Arrays;

public class Equation {
    public Equation(String equationString) {
        String[] terms = generateTerms((equationString.replace(" ", "") + "+").toCharArray());
    }

    private String[] generateTerms(char[] equation) {
        ArrayList<String> terms = new ArrayList<>();
        String term = "";

        for (char c : equation) {
            if ("+-".contains(Character.toString(c))) {
                if (term.length() > 0) {
                    terms.add(term);
                }
                term = (c == '-') ? String.valueOf(c) : "";
            } else {
                term += c;
            }
        }

        if (terms.get(0) == "") {
            terms.remove(0);
        }

        while (terms.contains("-(")) {
            int index = terms.indexOf("-(");
            terms.remove(index);
            terms.set(index, "-(" + terms.get(index));
        }

        return terms.toArray(new String[0]);
    }

    @Override
    public String toString() {
        return "";
    }
}
