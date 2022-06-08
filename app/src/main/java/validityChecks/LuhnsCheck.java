package validityChecks;

import helpers.PersonNumberConverter;

public class LuhnsCheck extends ValidityCheck {

	public LuhnsCheck() {
		super("Luhn's Check");
	}

	@Override
	public boolean check(String pNumber) {
		if (pNumber.length() < 10) return false;
		
		String convertedPNumber = PersonNumberConverter.convert(pNumber);
		int sum = 0;
		for (int i = 0; i < 10; ++i) {
			int coefficient = 2 - (i % 2);
			int number = coefficient * Character.getNumericValue(convertedPNumber.charAt(i));
			sum += (number - 1) % 9 + 1;
		}
		return (sum % 10 == 0);
	}

}
