//52
public class func{
	public void draw(Graphics2D g2,DialPlot plot,Rectangle2D frame,Rectangle2D view){
        Rectangle2D f = DialPlot.rectangleByRadius(frame, this.radius,
                this.radius);
        Ellipse2D e = new Ellipse2D.Double(f.getX(), f.getY(), f.getWidth(),
                f.getHeight());
        g2.fill(e);
        g2.setPaint(this.outlinePaint);
        g2.setStroke(this.outlineStroke);
        g2.draw(e);
}
}
