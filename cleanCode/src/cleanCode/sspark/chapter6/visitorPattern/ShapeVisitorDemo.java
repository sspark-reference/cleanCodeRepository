package cleanCode.sspark.chapter6.visitorPattern;

import java.util.Scanner;

public class ShapeVisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		El_Circle circle = new El_Circle("성술원");
		
		ShapeVisitor_AreaElement inc = new ShapeVisitor_AreaElement(10);
		ShapeVisitor_AreaElement inc5 = new ShapeVisitor_AreaElement(5);
		circle.setHeight(circle.getHeight() + 10);
		circle.accept(inc);
//		shape.accept(new ShapeVisitor_HeightElement());
		El_Square square = new El_Square("평사각");
		square.accept(inc);
	}

}
