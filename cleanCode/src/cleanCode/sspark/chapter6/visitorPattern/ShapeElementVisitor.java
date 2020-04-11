package cleanCode.sspark.chapter6.visitorPattern;

public interface ShapeElementVisitor {
	void visit(El_Square square);
	void visit(El_Rectangle rectangle);
	void visit(El_Circle circle);
	void visit(El_Shape shape);
}
