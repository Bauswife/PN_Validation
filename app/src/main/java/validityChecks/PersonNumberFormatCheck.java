package validityChecks;

public class PersonNumberFormatCheck extends ValidityCheck {

	public PersonNumberFormatCheck() {
		super("Person number format check");
	}

	@Override
	public boolean check(String pNumber) {
		String format;
		switch (pNumber.length()) {
		case 10:
			format = "NNNNNNNNNN";
			break;
		case 11: 
			format = "NNNNNNDNNNN";
			break;
		case 12:
			format = "NNNNNNNNNNNN";
			break;
		case 13:
			format = "NNNNNNNNDNNNN";
			break;
		default:
			return false;
		}
		
		for (int i = 0; i < pNumber.length(); ++i) {
			switch (format.charAt(i)) {
			case 'N':
				if (!Character.isDigit(pNumber.charAt(i))) return false;
				break;
			case 'D':
				if (!("+-".indexOf(pNumber.charAt(i)) > -1)) return false;
				break;
			}
		}
		
		return true;
	}

}
