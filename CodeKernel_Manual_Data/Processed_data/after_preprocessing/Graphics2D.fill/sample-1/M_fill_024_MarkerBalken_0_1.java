public class A{
	public void paintSingle(Graphics g, Context c,double x, double y1, Object obj) {
		double xu = Math.abs(c.getXUnit()) * width;
		double y2 = c.getYOrigin();
		Graphics2D g2 = (Graphics2D) g;
		Color savecolor = g2.getColor();
		Composite savecomposite = g2.getComposite();
		Stroke savestroke = g2.getStroke();
		g2.setComposite(AlphaComposite.SrcOver);
		g2.setColor(color);
		switch (kind) {
			case BALKEN_RECTANGLE:Shape shape = new Rectangle2D.Double(x - xu / 2, Math.min(y1, y2), xu,Math.abs(y1 - y2));
			g2.fill(shape);
			g2.setColor(Color.black);
			g2.setStroke(STROKE_ONE);
			g2.draw(shape);
			break;
			case BALKEN_STEM:shape = new Line2D.Double(x, y1, x, y2);
			g2.setStroke(MarkerPatch.STROKE_TWO);
			g2.draw(shape);
			break;
			default:throw new IllegalArgumentException();
		}
		g2.setStroke(savestroke);
		g2.setColor(savecolor);
		g2.setComposite(savecomposite);
	}
}