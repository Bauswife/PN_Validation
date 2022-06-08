package helpers;

public class LeapYearHelper {

	private static boolean isLeapYear(int year) {
		return (year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0)));
	}
	
	/** 
	 * @param pNumber A 10-, or 12-digit person number
	 * @return The number of days in February for the year of that person number
	 */
	
	public static int getFebruaryDays(String pNumber) { //This should work until year 2100
		int year;
		switch (pNumber.length()) {
		case 10:
		case 11:
			year = 2000 + Integer.valueOf(pNumber.substring(0, 2));
			if (pNumber.charAt(6) == '+') year -= 100;
			break;
		default: 
			year = Integer.valueOf(pNumber.substring(0, 4));
			break;
		}
		
		if (isLeapYear(year)) {
			return 29;
		}
		return 28;
	}
	
}
