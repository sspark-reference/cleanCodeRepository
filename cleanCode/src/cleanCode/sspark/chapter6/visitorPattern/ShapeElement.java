package cleanCode.sspark.chapter6.visitorPattern;

public interface ShapeElement {
	
	public void accept(ShapeElementVisitor visitor);
	
}
