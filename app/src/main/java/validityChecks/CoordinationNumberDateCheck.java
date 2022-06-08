package validityChecks;

import helpers.LeapYearHelper;

public class CoordinationNumberDateCheck extends DateCheck {

	public CoordinationNumberDateCheck() {
		super("Coordination number date check", 61);
	}

	@Override
	protected int[] getDayArray(String pNumber) {
		return new int[] {91, LeapYearHelper.getFebruaryDays(pNumber) + 60, 91, 90, 91, 90, 91, 91, 90, 91, 90, 91};
	}

}
