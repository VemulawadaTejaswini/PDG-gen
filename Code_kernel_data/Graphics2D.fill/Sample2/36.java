//35
public class func{
	public void createPrettyImage(final BufferedImage bufferedImage,final int shadeWidth,final int round){
        final Shape old = g2d.getClip ();
        g2d.setClip ( border );
        g2d.drawImage ( bufferedImage, shadeWidth, shadeWidth, null );
        g2d.setClip ( old );
        GraphicsUtils.drawShade ( g2d, border, StyleConstants.shadeColor, shadeWidth );
        g2d.setPaint ( new LinearGradientPaint ( 0, shadeWidth, 0, height - shadeWidth, new float[]{ 0f, 0.5f, 1f },
                new Color[]{ new Color ( 125, 125, 125, 48 ), new Color ( 125, 125, 125, 0 ), new Color ( 125, 125, 125, 48 ) } ) );
        g2d.fill ( border );
        g2d.setColor ( Color.GRAY );
        g2d.draw ( border );
        g2d.dispose ();
}
}
