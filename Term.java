import java.util.Arrays;

public class Term {
    public Term(String termString) {
        String[] x = termString.split("[()]");
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {
        Term t = new Term("(3x^2)^2");
    }
}
