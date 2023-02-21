public class A{
	public void drawShape(Graphics2D g2d) {
		g2d.setColor(getColor());
		if (getStroke() != null) {
			g2d.setStroke(getStroke());
		}
		if (isFill()) {
			g2d.fill(getShape());
		}
		g2d.draw(getShape());
	}
}