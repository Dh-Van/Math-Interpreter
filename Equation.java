public class Equation {
    private Term[] terms;

    public Equation(String equationString){
        equationString = equationString.replace(" ", "");
        String[] equationTokens;
        if(equationString.charAt(0) == '-'){
            equationTokens = equationString.substring(1).split("[\\+-]");
            equationTokens[0] = "-" + equationTokens[0];
        } else {
            equationTokens = equationString.split("[\\+-]");
        }
        terms = new Term[equationTokens.length];

        for(int i = 0; i < terms.length; i++){
            String[] t = equationTokens[i].split("-");
            int index = equationString.indexOf(t[t.length - 1]);
            String sign = "";
            String x = "";
            try{
                x = equationString.substring(index - 1, index);
            } catch (IndexOutOfBoundsException e){
                x = "+";
            }
            sign = x.equals("-") ? x : "";
            terms[i] = new Term(sign + t[t.length - 1]);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for(Term t : terms){
            str += t.toString() + " + ";
        }

        return str.substring(0, str.length() - 3);
    }

    public double getValue(int x){
        double value = 0.0;
        for(Term t : terms){
            value += t.getCoefficient() * (Math.pow(x, t.getExponent()));
        }

        return value;
    }

    public static void main(String[] args) {
        Equation input = new Equation("(-2x)^2 - 3x + 1");
        // Equation input = new Equation("-1");
        System.out.println(input);
        System.out.println(input.getValue(4));

    }
}
