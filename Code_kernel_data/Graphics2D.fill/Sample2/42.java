//41
public class func{
	public void draw(Graphics2D g2,DialPlot plot,Rectangle2D frame,Rectangle2D view){
        if (p instanceof GradientPaint) {
            p = this.gradientPaintTransformer.transform((GradientPaint) p,
                    view);
        }
        g2.setPaint(p);
        g2.fill(view);
}
}
