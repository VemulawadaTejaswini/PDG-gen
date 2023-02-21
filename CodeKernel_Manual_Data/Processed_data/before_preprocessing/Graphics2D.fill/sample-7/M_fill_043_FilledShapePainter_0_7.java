public class A{
	public Shape paint(Object key, Graphics g, Rectangle bounds,PainterState state, GraphicsContext context){
		Graphics2D g2d = (Graphics2D) g;
		
		Shape shape = (Shape) context.get(key, PainterResources.SHAPE);
		if (shape == null)shape = (Shape) state.get(StateResources.SHAPE);

		if (shape != null)g2d.fill(shape);
		return shape;
	}
}