package cleanCode.sspark.chapter3.function;

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