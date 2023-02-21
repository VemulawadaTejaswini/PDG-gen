public class A{
	public void render(Graphics2D g) {
		g.setColor(lineColor);
		g.draw(shape);
		g.setColor(fillColor);
		g.fill(shape);
	}
}