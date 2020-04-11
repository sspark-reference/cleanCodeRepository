package cleanCode.sspark.chapter6.visitorPattern;

public class El_Shape implements ShapeElement{

	ShapeElement[] elements;
	
	public ShapeElement[] getElements() {
		return elements.clone(); //
	}
	
	public El_Shape() {
		// TODO Auto-generated constructor stub
		this.elements = new ShapeElement[] {
				new El_Square("TopLeft Square"), new El_Square("TopRight Square"),
				new El_Rectangle("BottomLeft Rectangle"), new El_Rectangle("BottomRight Rectangle"),
				new El_Circle("Center Circle")
		};
	}
	
	@Override
	public void accept(ShapeElementVisitor visitor) {
		// TODO Auto-generated method stub
		for(ShapeElement element : this.getElements()) {
			element.accept(visitor);
		}
		
		visitor.visit(this);
	}
}
