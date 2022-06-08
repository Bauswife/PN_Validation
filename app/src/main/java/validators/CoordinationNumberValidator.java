package validators;

import validityChecks.CoordinationNumberDateCheck;
import validityChecks.LuhnsCheck;
import validityChecks.PersonNumberFormatCheck;
import validityChecks.ValidityCheck;

public class CoordinationNumberValidator extends Validator {

	@Override
	public ValidityCheck[] getChecks() {
		return new ValidityCheck[] {new PersonNumberFormatCheck(), new CoordinationNumberDateCheck(), new LuhnsCheck()};
	}

}
