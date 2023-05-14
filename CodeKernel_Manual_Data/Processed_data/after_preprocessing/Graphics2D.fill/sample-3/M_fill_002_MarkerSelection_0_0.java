public class A{
	public void paintConnected(Graphics g, Context c, double x1, double y1,Object obj, double x2, double y2) {
		Graphics2D g2 = (Graphics2D) g;
		Shape sh;
		switch (shape) {
			case SHAPE_RECT:RectangularShape rs = new Rectangle2D.Double();
			rs.setFrameFromDiagonal(x1, y1, x2, y2);
			sh = rs;
			break;
			case SHAPE_OVAL:rs = new Ellipse2D.Double();
			rs.setFrameFromDiagonal(x1, y1, x2, y2);
			sh = rs;
			break;
			case SHAPE_LINE:sh = new Line2D.Double(x1, y1, x2, y2);
			break;
			case SHAPE_RING:rs = new Ellipse2D.Double();
			rs.setFrameFromDiagonal(x1, y1, x2, y2);
			Stroke now = new BasicStroke(3);
			sh = now.createStrokedShape(rs);
			break;
			default:throw new IllegalArgumentException();
		}
		Paint paint = g2.getPaint();
		switch (fill) {
			case FILL_STRIPES:g2.setPaint(TEXTURE_STRIPES);
			g2.fill(sh);
			break;
			case FILL_GRAY:g2.setPaint(TEXTURE_GRAY);
			g2.fill(sh);
			break;
			case FILL_NONE:break;
			default:throw new IllegalArgumentException();
		}
		g2.setPaint(paint);
	}
}