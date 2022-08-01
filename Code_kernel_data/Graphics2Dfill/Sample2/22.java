//21
public class func{
	public void paintBackground(final Graphics2D g2d,final Rectangle bounds,final E c,final Shape backgroundShape){
            g2d.setPaint ( LafUtils.getWebGradientPaint ( 0, bgBounds.y, 0, bgBounds.y + bgBounds.height ) );
            g2d.setPaint ( c.getBackground () );
        g2d.fill ( backgroundShape );
}
}
