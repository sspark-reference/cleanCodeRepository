package cleanCode.sspark.chapter3.function;

import java.math.BigDecimal;

public class CommissionedEmployee extends Employee{
	
	
	@Override
	public boolean isPayday() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Money calculatePay() {
		Money m = new Money();
		
		m.budget = new BigDecimal(1000);
		
		return m;
	}

	@Override
	public void deliveryPay() {
		// TODO Auto-generated method stub
		
	}
	
	public CommissionedEmployee(EmployeeRecord r) {
		// TODO Auto-generated constructor stub
	}
	//====================================================
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
	
	
}
