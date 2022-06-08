package validityChecks;

import helpers.PersonNumberConverter;

public class OrganizationNumberFormatCheck extends ValidityCheck {

	public OrganizationNumberFormatCheck() {
		super("Organization number format check");
	}

	@Override
	public boolean check(String pNumber) {
		if (pNumber.length() < 10) return false;
		String convertedPNumber = PersonNumberConverter.convert(pNumber);
		
		if (Integer.valueOf(convertedPNumber.substring(2, 3)) < 20 ) {
			System.out.println(convertedPNumber);
			return false;
		}
		
		if (pNumber.length() > 11 && !pNumber.substring(0, 2).equals("16")) {
			System.out.println("HERE");
			return false;
		}
		
		return true;
	}

}
