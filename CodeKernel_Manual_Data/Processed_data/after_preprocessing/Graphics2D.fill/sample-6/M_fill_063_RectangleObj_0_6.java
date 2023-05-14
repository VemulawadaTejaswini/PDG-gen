public class A{
	public void draw() {
		if (start == null || end == null) {
			return;
		}
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setColor(drawColor);
		if (select != 0) {
			drawSelection();
		}
		else {
			g2D.drawRect(x1, y1, x2 - x1, y2 - y1);
		}
		if (fillColor != null) {
			fill(fillColor);
		}
	}
}