package validators;

import validityChecks.PersonNumberDateCheck;
import validityChecks.LuhnsCheck;
import validityChecks.PersonNumberFormatCheck;
import validityChecks.ValidityCheck;

public class PersonNumberValidator extends Validator {
	
	@Override
	public ValidityCheck[] getChecks() {
		return new ValidityCheck[] {new PersonNumberFormatCheck(), new PersonNumberDateCheck(), new LuhnsCheck()};
	}

}
