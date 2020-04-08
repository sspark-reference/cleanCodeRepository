package cleanCode.com.sspark.function;

import cleanCode.com.sspark.function.cleanException.InvalidEmployeeType;
import cleanCode.com.sspark.function.model.EmployeeRecord;

public interface EmployeeFactory {
	
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
