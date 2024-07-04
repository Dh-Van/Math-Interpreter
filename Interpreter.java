public class Interpreter {

	public static void main(String[] args) {
		Equation[] testCases = new Equation[] {
				new Equation("4"),
				new Equation("-4"),
				new Equation("4x - 5"),
				new Equation("-4x + 5"),
				new Equation("-4x^2 + 2x - 4"),
				new Equation("-(4x)^2 - 6x + 9"),
				new Equation("-(-4x)^2 + 8x + 3"),
				new Equation("2x^3 - x^2 + 5x + 3"),
				new Equation("(3x^2)^2 + x^3 + -(-4x)^-2 + 8x - 1")
		};

		// for (Equation eq : testCases) {
		// System.out.println(eq);
		// }

		// Equation temp = new Equation("4x^2 + 4x - 1");

		Equation x = new Equation("-(-4x)^2 + 8x + 3");

	}
}
