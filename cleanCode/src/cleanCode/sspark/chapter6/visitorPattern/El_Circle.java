package cleanCode.sspark.chapter6.visitorPattern;

public class El_Circle implements ShapeElement {

	private String name;
	
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public El_Circle(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public void accept(ShapeElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	
}
