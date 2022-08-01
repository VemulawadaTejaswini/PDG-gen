//98
public class func{
	public void cutImage(final Shape shape,final Image image){
        final int w = image.getWidth ( null );
        final int h = image.getHeight ( null );
        final BufferedImage cutImage = createCompatibleImage ( w, h, Transparency.TRANSLUCENT );
        final Graphics2D g2d = cutImage.createGraphics ();
        GraphicsUtils.setupAntialias ( g2d );
        g2d.setPaint ( Color.WHITE );
        g2d.fill ( shape );
}
}
