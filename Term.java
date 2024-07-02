public class Term {
    private String termString;
    private double[] tokens;

    public Term(String termString){
        this.termString = termString;
        this.tokens = tokenizeString();

    }

    private double[] tokenizeString(){
        double[] tokens = new double[2];

        termString = termString.replace(" ", "");
        String[] stringTokens = termString.split("[\\^]");

        if(stringTokens[0].contains("x")){
            try {
                tokens[1] = Double.parseDouble(stringTokens[1]);
            } catch (IndexOutOfBoundsException e) {
                tokens[1] = 1;
            }
        } else {
            tokens[1] = 0;
        }

        stringTokens[0] = stringTokens[0].replace("x", "");

        if(stringTokens[0].contains("(")){
            double base = Double.parseDouble(stringTokens[0].substring(stringTokens[0].indexOf("("), stringTokens[0].length() - 1));
            tokens[0] = Math.pow(base, tokens[1]);
        } else {
            tokens[0] = Double.parseDouble(stringTokens[0]);
        }

        // if(stringTokens[0].indexOf("-") != -1){
        //     tokens[0] *= -1;
        // }
 
        return tokens;
    }

    public double[] gettokenizedString(){
        return this.tokenizeString();
    }

    public void printTokenizedString(){
        for(double s : this.gettokenizedString()){
            System.out.println(s);
        }
        System.out.println("-----------------");
    }

    @Override
    public String toString() {
        return tokens[0] + "x ^ " + tokens[1];
    }

    public double getCoefficient(){
        return tokens[0];
    }

    public double getExponent(){
        return tokens[1];
    }

    // public static void main(String[] args) {
    //     Term constant = new Term("4");
    //     Term linear = new Term("4x");
    //     Term quadratic = new Term("4x^2");
    //     Term quadraticSquared = new Term("(4x)^2");

    //     constant.printTokenizedString();
    //     linear.printTokenizedString();
    //     quadratic.printTokenizedString();
    //     quadraticSquared.printTokenizedString();

    // }

}
