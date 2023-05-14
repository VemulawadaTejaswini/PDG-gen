public class A{
	public void paintSingle(Graphics g, Context c, double x, double y, Object obj) {
		Graphics2D g2 = (Graphics2D) g;
		AffineTransform h = g2.getTransform();
		g2.translate(x, y);
		Color savecolor = g2.getColor();
		g2.setColor(color);
		g2.fill(shape);
		g2.setColor(savecolor);
		g2.setTransform(h);
	}
}