package cleanCode.com.sspark.function;

import cleanCode.com.sspark.function.cleanException.InvalidEmployeeType;
import cleanCode.com.sspark.function.model.CommissionedEmployee;
import cleanCode.com.sspark.function.model.EmployeeRecord;

public class EmployeeFactoryImpl implements EmployeeFactory{

	@Override
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
		// TODO Auto-generated method stub
			
		switch(r.type) {
		
		case "COMMISSIONED" : 
			return new CommissionedEmployee(r);	
		default : 
			throw new InvalidEmployeeType(r.type);
		}
	}
}
