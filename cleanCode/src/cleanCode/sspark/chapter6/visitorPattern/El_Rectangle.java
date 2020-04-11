package cleanCode.sspark.chapter6.visitorPattern;

public class El_Rectangle implements ShapeElement {
	
	private String name;
	
	public El_Rectangle(String name) {
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
