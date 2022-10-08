public class errorHandling {
	private static int divideByZero() {
		return 1 / 0; // this line throws an ArithmeticException (dividing by 0)
	}

	private static void outOfArrayIndex() {
		int [] myArray = new int[10];
		for (int i = 0; i <= 10; ++i) { // this loop iterates from 0 to 10 (including 10)
			myArray[i] = i;              // but there is no myArray[10] -> this throws ArrayIndexOutOfBoundsException
		}
	}

	public static void main(String[] args) {
		try {
			int result = divideByZero();        // error thrown by calling this function will be propagated to this line
		} catch (ArithmeticException e) {      // here we can easily catch this single exception (ArithmeticException) in the catch block
			System.out.println("1st catch: " + e.getMessage()); // and display what gone wrong
		}

		try {
			outOfArrayIndex(); // throws ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2nd catch: " + e.getMessage());
		}

		try {
			int result = divideByZero(); // try to replace these two lines
			outOfArrayIndex();           // and see what happened

			// SPOILER:
			// when there is an error inside try block every piece of code below the line that thrown an error
			// will NOT be executed

			System.out.println("This string will not be printed!");
		} catch (Exception e) {
			System.out.println("3rd catch: " + e.getMessage());
		}

		// finally keyword
		try {
			outOfArrayIndex();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("4th catch: " + e.getMessage());
		} finally {
			// this block of code will be executed every time
			// no matters if an error was thrown or not
			// TIP: try comment out the code inside 'try' block
			// so there will not be any thrown errors
			// and this block will be executed either
			System.out.println("Finally!!");
		}
	}
}
