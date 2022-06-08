package validityChecks;

import helpers.PersonNumberConverter;

public abstract class DateCheck extends ValidityCheck {

	private int dayFloor; 
	
	public DateCheck(String name, int dayFloor) {
		super(name);
		this.dayFloor = dayFloor;
	}
	
	protected abstract int[] getDayArray(String pNumber);
	
	@Override
	public boolean check(String pNumber) {
		if (pNumber.length() < 10) return false;
		String convertedPNumber = PersonNumberConverter.convert(pNumber);
		int[] daysInMonth = getDayArray(pNumber);
		int month = Integer.valueOf(convertedPNumber.substring(2, 4));
		int day = Integer.valueOf(convertedPNumber.substring(4, 6));
		
		if (month > 12 || month < 1) {
			return false;
		}
		
		if (day > daysInMonth[month] || day < this.dayFloor) {
			return false;
		}
		
		return true;
	}

}
