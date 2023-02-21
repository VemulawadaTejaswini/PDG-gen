public class A{
	public void paintSingle(Graphics g, Context c, double x, double y, Object o) {
		double xu = Math.abs(c.getXUnit()) * width;
		Graphics2D g2 = (Graphics2D) g;
		Color savecolor = g2.getColor();
		Composite savecomposite = g2.getComposite();
		g2.setComposite(AlphaComposite.SrcOver);
		g2.setColor(color);
		switch (kind) {
			case PATCH_RECTANGLE:double yu = Math.abs(c.getYUnit()) * height;
			Shape shape = new Rectangle2D.Double(x - xu / 2, y - yu / 2, xu, yu);
			g2.fill(shape);
			break;
			case PATCH_HLINE:shape = new Line2D.Double(x - xu / 2, y, x + xu / 2, y);
			Stroke savestroke = g2.getStroke();
			g2.setStroke(STROKE_TWO);
			g2.draw(shape);
			g2.setStroke(savestroke);
			break;
			default:throw new IllegalArgumentException();
		}
		g2.setColor(savecolor);
		g2.setComposite(savecomposite);
	}
}