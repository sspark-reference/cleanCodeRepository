package cleanCode.sspark.chapter6.visitorPattern;

public class El_Square implements ShapeElement {

	private String name;
	private int height = 10;
	private int side;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public El_Square(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void accept(ShapeElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public void setName(String name) {
		this.name = name;
	}
}
