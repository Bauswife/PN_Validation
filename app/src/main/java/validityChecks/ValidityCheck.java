package validityChecks;

public abstract class ValidityCheck {

	public String name;
	
	public ValidityCheck(String name) {
		this.name = name;
	}
	
	public abstract boolean check(String pNumber);
	
}
