import java.util.Arrays;
import java.util.HashMap;

public class PracticeQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseString("RITESH"));
		String name = "Nirmal";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		swapStrings("Nirmal", "Rawat");
		fibonacciSeries(10);
		checkArmStrongNumber(371);
		checkArmStrongNumber(153);
		checkArmStrongNumber(370);
		checkArmStrongNumber(407);
		checkArmStrongNumber(1634);
		System.out.println(sumOfDigits(371));
		System.out.println(checkPrime(2));
		System.out.println(checkPrime(3));
		System.out.println(checkPrime(4));
		System.out.println(checkPrime(5));
		System.out.println(checkPrime(6));
		System.out.println(checkPrime(7));
		System.out.println(checkPrime(8));

	}

	// Method to reverse a string
	public static String reverseString(String inputString) {
		String reversedString = "";
		for (int i = (inputString.length() - 1); i >= 0; i--) {
			reversedString = reversedString + inputString.charAt(i);
		}
		return reversedString;
	}

	// Method to swap two string without using third;
	public static void swapStrings(String s1, String s2) {
		s1 = s1.concat(s2);
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("String 1 :=" + s1);
		System.out.println("String 2 :=" + s2);

	}

	// Method to print fibonacci series

	public static void fibonacciSeries(int length) {

		int series[] = new int[length];
		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < length; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}
		Arrays.stream(series).forEach(System.out::println);
	}

	// Method to check armstrong number

	public static void checkArmStrongNumber(int actualnum) {
		double num = actualnum;
		double sumOfcubes = 0;
		while (num != 0) {
			double digit = num % 10;
			sumOfcubes += (Math.pow(digit, 3));
			num = num / 10;
		}
		if (actualnum == sumOfcubes) {
			System.out.println(actualnum + " is an Armstrong number");
		} else {
			System.out.println(actualnum + " is not an Armstrong number");
		}
	}

	// sum of digits of an integer
	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;

	}

	// program to check prime number
	public static boolean checkPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	// method to count the number of times a character is present in an string
	public void getCountOfOccurence(String s) {
		char[] strArray = s.toCharArray();

		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();

	}

}
