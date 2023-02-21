public class A{
	public static void main(){
		Graphics2D g2d = (Graphics2D) g;
		Shape shape = (Shape) context.get(key, PainterResources.SHAPE);
		if (shape != null)g2d.fill(shape);
	}
}