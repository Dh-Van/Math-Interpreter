import java.util.ArrayList;
import java.util.Arrays;

public class Equation {
    String[] terms;

    public Equation(String equationString) {
        terms = equationString.replace(" ", "").split("\\+");
    }

    @Override
    public String toString() {
        return Arrays.toString(terms);
    }
}
