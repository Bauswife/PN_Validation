package validityChecks;

import helpers.LeapYearHelper;

public class PersonNumberDateCheck extends DateCheck {

	public PersonNumberDateCheck() {
		super("Person number date check", 1);
	}

	@Override
	protected int[] getDayArray(String pNumber) {
		return new int[] {31, LeapYearHelper.getFebruaryDays(pNumber), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	}

}
