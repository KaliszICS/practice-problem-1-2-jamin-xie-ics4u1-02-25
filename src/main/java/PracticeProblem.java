public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static boolean validIndex(int[] intArray, int index) {
		try {
			int temp = intArray[index];
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String word) {
		try {
			return Integer.parseInt(word);
		} catch (NumberFormatException e) {
			return 0;
		}
	} 

}
