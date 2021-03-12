//CS1410 Assignment 2: SmallMethods
//Nils Streedain
package a2;

public class SmallMethods {
	public static void main(String args[]) {
		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for isZero()\n");
		System.out.println("isZero(-1) results in: " + isZero(-1));
		System.out.println("isZero(0) results in: " + isZero(0));
		System.out.println("isZero(1) results in: " + isZero(1));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for describeNumber()\n");
		System.out.println("describeNumber(-1) results in: " + describeNumber(-1));
		System.out.println("describeNumber(0) results in: " + describeNumber(0));
		System.out.println("describeNumber(1) results in: " + describeNumber(1));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for classifyNumber()\n");
		System.out.println("classifyNumber(-1) results in: " + classifyNumber(-1));
		System.out.println("classifyNumber(0) results in: " + classifyNumber(0));
		System.out.println("classifyNumber(1) results in: " + classifyNumber(1));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for isEvenlyDivisibleByThreeOrFive()\n");
		System.out.println("isEvenlyDivisibleByThreeOrFive(15) results in: " + isEvenlyDivisibleByThreeOrFive(15));
		System.out.println("isEvenlyDivisibleByThreeOrFive(17) results in: " + isEvenlyDivisibleByThreeOrFive(17));
		System.out.println("isEvenlyDivisibleByThreeOrFive(-33) results in: " + isEvenlyDivisibleByThreeOrFive(-33));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for chooseSmaller()\n");
		System.out.println("chooseSmaller(-1, 0) results in: " + chooseSmaller(-1, 0));
		System.out.println("chooseSmaller(0, 0) results in: " + chooseSmaller(0, 0));
		System.out.println("chooseSmaller(0, 1)) results in: " + chooseSmaller(0, 1));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for firstDoublingPastOneHundred()\n");
		System.out.println("firstDoublingPastOneHundred(-1) results in: " + firstDoublingPastOneHundred(-1));
		System.out.println("firstDoublingPastOneHundred(0) results in: " + firstDoublingPastOneHundred(0));
		System.out.println("firstDoublingPastOneHundred(1) results in: " + firstDoublingPastOneHundred(1));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for skipLetters()\n");
		System.out.println("skipLetters(\"abcdefg\") results in: " + skipLetters("abcdefg"));
		System.out.println("skipLetters(\"12121212\") results in: " + skipLetters("12121212'"));
		System.out.println("skipLetters(\"123456\") results in: " + skipLetters("123456"));

		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tests for makeSquare()\n");
		System.out.println("makeSquare(2) results in:\n" + makeSquare(2));
		System.out.println("makeSquare(3) results in:\n" + makeSquare(3));
		System.out.println("makeSquare(5) results in:\n" + makeSquare(5));

		System.out.println("\n--------------------------------------------------\n");
	}

	/**
	 * Calculates to see if the parameter is "zero or not by returning a boolean. As
	 * an example, isZero(5) would result in false.
	 * 
	 * @param number The integer determined if it is zero or not.
	 * @return A string stating wheather number is zero or not.
	 */
	public static boolean isZero(int number) {
		boolean isZeroBoolean = false;
		// If number is equal to 0, true is returned, otherwise, false is returned
		if (number == 0) {
			isZeroBoolean = true;
		}
		return isZeroBoolean;
	}

	/**
	 * Calculates to see if the parameter is "Zero" or "Not Zero". As an example,
	 * describeNumber(5) would result in "Not Zero".
	 * 
	 * @param number The integer determined if it is "Zero" or "Not Zero".
	 * @return A string stating wheather number is "Zero" or "Not Zero".
	 */
	public static String describeNumber(int number) {
		String describeNumberString = "Not Zero";
		// If number is equal to 0, "Zero" is returned, otherwise "Not Zero" is
		// returned.
		if (number == 0) {
			describeNumberString = "Zero";
		}
		return describeNumberString;
	}

	/**
	 * Calculates to see if the parameter is greater than, equal to, or less than 0.
	 * As an example, classifyNumber(7) would result in "Positive".
	 * 
	 * @param number The integer determined if it's "Positive", "Negative", or
	 *               "Zero".
	 * @return A string stating weather number is "Positive", "Negative", or "Zero".
	 */
	public static String classifyNumber(int number) {
		String classifyNumberString = "Positive";
		// If the parameter is less than zero, "Negative is returned; equal to zero,
		// "Zero" is returned; otherwise "Positive" is returned.
		if (number < 0) {
			classifyNumberString = "Negative";
		} else if (number == 0) {
			classifyNumberString = "Zero";
		}
		return classifyNumberString;
	}

	/**
	 * Calculates to see if the parameter is divisible by either 3 or 5, if
	 * divisible by either, true will be returned, otherwise false will be returned.
	 * As an example, isEvenlyDivisibleByThreeOrFive(9) would result in true .
	 * 
	 * @param number The integer tested to see if it is divisible by 3 or 5.
	 * @return A boolean stating weather the parameter is divisible by 3 or 5.
	 */
	public static boolean isEvenlyDivisibleByThreeOrFive(int number) {
		Boolean isEvenlyDivisibleByThreeOrFiveBoolean = false;
		// Tests if number, when divided by 3 or 5, has a remainder of 0.
		if (number % 3 == 0 || number % 5 == 0) {
			isEvenlyDivisibleByThreeOrFiveBoolean = true;
		}
		return isEvenlyDivisibleByThreeOrFiveBoolean;
	}

	/**
	 * Compares 2 numbers and returns the number of smaller value. As an example,
	 * chooseSmaller(51.1, 102.5) would result in: 51.1.
	 * 
	 * NOTE: If both numbers are the same, number1 will be chosen.
	 * 
	 * @param number1 (double) The first of the two numbers to be compared, this one
	 *                will be selected if both numbers are the same.
	 * @param number2 (double) The second of the two numbers to be compared.
	 * @return A double containing the smaller of the two number parameters.
	 */
	public static double chooseSmaller(double number1, double number2) {
		double smallerNumber = number1;
		// number1 is returned unless number2 is smaller.
		if (number1 > number2) {
			smallerNumber = number2;
		}
		return smallerNumber;
	}

	/**
	 * Produces an integer consisting of what the number parameter would equal if
	 * doubled until number was greater than 100. As an example,
	 * firstDoublingPastOneHundred(2) would result in: 128.
	 * 
	 * NOTE: If number is zero or less, zero will be returned.
	 * 
	 * @param number The integer to be doubled until greater than 100.
	 * @return An integer consisting of the number parameter doubled until greater
	 *         than 100.
	 */
	public static int firstDoublingPastOneHundred(int number) {
		int firstDoublingPastOneHundredInteger = 0;
		// When the number is between 0 and 100 it will be doubled repeatedly until
		// greater than 100. If the original number is 0 or negative 0 will be returned.
		while (number > 0 && number < 100) {
			number *= 2;
			firstDoublingPastOneHundredInteger = number;
		}
		return firstDoublingPastOneHundredInteger;
	}

	/**
	 * Produces a String containing the original inputString except with every other
	 * letter removed. As an example, skipLetters("12121212") would result in:
	 * "1111".
	 * 
	 * @param inputString The string to have every other letter removed from.
	 * @return A string consisting of inputString except with every other letter
	 *         removed.
	 */
	public static String skipLetters(String inputString) {
		int inputStringLength = inputString.length();
		int indexPoint = 0;
		String outputString = "";
		// Determine length of inputString and print the letter associated with the
		// current indexPoint, then add 2 to the index point to skip the next letter.
		// Repeat process for while inputString.
		while (inputStringLength > indexPoint) {
			outputString += inputString.substring(indexPoint, indexPoint + 1);
			indexPoint += 2;
		}
		return outputString;
	}

	/**
	 * Produces a String in the shape of a square with a height and width of the
	 * input integer. As an example, makeSquare(5) would result in:
	 * +---+
	 * |   |
	 * |   |
	 * |   |
	 * +---+
	 * 
	 * @param squareSize The height and width of the output square in characters.
	 * @return A string containing a text art square.
	 */
	public static String makeSquare(int squareSize) {
		String square = "";
		int currentHeight = 0;
		// Repeat function, creating one line at a time until the squareSize is met.
		while (squareSize > currentHeight) {
			if (currentHeight == 0 || currentHeight == squareSize - 1) {
				// make first/last lines with characters '+' and '-'
				square += makeLine('+', '-', squareSize) + "\n";
			} else {
				// make middle lines with characters '|' and ' '
				square += makeLine('|', ' ', squareSize) + "\n";
			}
			currentHeight += 1;
		}
		return square;
	}

	/**
	 * Produces a String starting and ending with the edge character and having the
	 * inner char repeated in-between. The total number of characters in the string
	 * is width. As an example makeLine('+', '-', 8) would return the string
	 * "+------+".
	 * 
	 * NOTE: This method is already completely implemented and must not be modified
	 * for the assignment.
	 * 
	 * @param edge  The character used at the start and end of the returned string.
	 * @param inner The character repeated in-between the edge char.
	 * @param width The total number of characters in the returned string. Width
	 *              must be greater or equal to 2.
	 * @return A string with width characters.
	 */
	public static String makeLine(char edge, char inner, int width) {
		String line = "";
		int currentLocation = 0;
		// Make the middle part of the line first.
		while (currentLocation < width - 2) {
			line = line + inner;
			currentLocation = currentLocation + 1;
		}
		// Add in the start and end character to the line.
		return edge + line + edge;
	}
}
