//120
public class func{
	public void drawFillShape(final Graphics2D g2d){
        final Ellipse2D shape = new Ellipse2D.Float();
        setShapeFrame(shape, strokeWidth);
        g2d.setStroke(new BasicStroke(strokeWidth));
        g2d.setColor(counterColor);
        g2d.fill(shape);
}
}
