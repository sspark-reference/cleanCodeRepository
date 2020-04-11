package cleanCode.sspark.chapter3.function;

public interface EmployeeFactory {
	
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
