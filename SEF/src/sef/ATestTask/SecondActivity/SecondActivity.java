package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args){

		//TODO Use the calculator to calculate different values

		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
	    int x = 11;
		int y = 2;
		int sum;
		int diff;


		private static int add(int x, int y) {
			int sum = x + y;
			return sum;
		}

		private static int subtract(int x, int y) {
			int diff = 0;
			if (x > y) {
				diff = x - y;
			} else {
				diff = y - x;
			}
			return diff;
		}

		int x = 100;
		int y = 33;

	    private static int divide(int x, int y) {
		int divValue = 0;
		if (y == 0) {
			System.out.println("division by null is not allowed");
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;


		private static int multiply(int[] numbers) {
			int temp = 1;
			for (int i = 0; i < numbers.length; i++) {
				temp = temp * numbers[i];
			}
			return temp;
		}


	}

	//TODO create the Calculator (here or in additional class)
	//Calculator
			int x = 10;
			int y = 5;
			int[] nums = {1, 2, 3, 4};
			System.out.println("Addition - " + add(x, y));
			System.out.println("Subtraction - " + subtract(x, y));
			System.out.println("Multiply - " + multiply(nums));
			System.out.println("Divide - " + divide(x, y));
		}
}


