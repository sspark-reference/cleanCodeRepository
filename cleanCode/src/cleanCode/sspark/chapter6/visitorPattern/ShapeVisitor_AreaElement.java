package cleanCode.sspark.chapter6.visitorPattern;

public class ShapeVisitor_AreaElement implements ShapeElementVisitor {
	
	private int height;
	
	public ShapeVisitor_AreaElement(int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
	}
	
	@Override
	public void visit(El_Square square) {
		// TODO Auto-generated method stub
		square.setHeight(square.getHeight() + this.height);
		System.out.println(square.getName()+"의 높이는"+square.getHeight());
	}

	@Override
	public void visit(El_Shape shape) {
		// TODO Auto-generated method stub
//		shape.setHeight(shape.getHeight() + this.height);
	}

	@Override
	public void visit(El_Rectangle rectangle) {
		// TODO Auto-generated method stub
//		rectangle.setHeight(rectangle.getHeight() + this.height);
	}

	@Override
	public void visit(El_Circle circle) {
		// TODO Auto-generated method stub
		circle.setHeight(circle.getHeight() + this.height);
		System.out.println(circle.getName()+"의 높이는"+circle.getHeight());
	}

}
