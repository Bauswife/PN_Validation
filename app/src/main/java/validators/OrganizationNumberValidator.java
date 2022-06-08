package validators;

import validityChecks.LuhnsCheck;
import validityChecks.OrganizationNumberFormatCheck;
import validityChecks.PersonNumberFormatCheck;
import validityChecks.ValidityCheck;

public class OrganizationNumberValidator extends Validator {

	@Override
	public ValidityCheck[] getChecks() {
		return new ValidityCheck[] {new PersonNumberFormatCheck(), new OrganizationNumberFormatCheck(), new LuhnsCheck()};
	}

}
