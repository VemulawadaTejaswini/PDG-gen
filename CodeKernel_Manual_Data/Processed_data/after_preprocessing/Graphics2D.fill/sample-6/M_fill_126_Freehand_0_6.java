public class A{
	public void draw() {
		g2D.setColor(drawColor);
		g2D.drawPolyline(poly.xpoints, poly.ypoints, poly.npoints);
		if (fillColor != null) {
			fill(fillColor);
		}
	}
}