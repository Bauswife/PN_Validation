package helpers;

public class PersonNumberConverter {

	/**
	 * This method converts a number formatted like a person number to NNNNNNNNNN-format
	 * @param number A person number
	 * @return A 10-digit person number string with no divider between the 6th and 7th number.
	 */
	
	public static String convert(String number) {
		switch (number.length()) {
		case 10:
			return number;
		case 11: 
			return number.substring(0, 6) + number.substring(7, 11);
		case 12:
			return number.substring(2, 12);
		case 13:
			return number.substring(2, 8) + number.substring(9, 13);
		}
		return "";
	}
	
}
