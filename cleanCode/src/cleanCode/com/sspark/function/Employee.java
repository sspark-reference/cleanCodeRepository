package cleanCode.com.sspark.function;

import cleanCode.com.sspark.function.model.Money;
//중복 줄이기, 표현력 높이기, 초반부터 간단한 추상화 고려하기
public abstract class Employee {
	public abstract boolean isPayday();
	public abstract Money calculatePay();
	public abstract void deliveryPay();
	
}
