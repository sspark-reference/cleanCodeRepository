package cleanCode.sspark.chapter3.function;

public class InvalidEmployeeType extends Exception{
		
	
	public InvalidEmployeeType(String msg){
		
		super(msg+"타입은 잘못되었습니다.");
	}
}
