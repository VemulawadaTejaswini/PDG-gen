//60
public class func{
public void createImageShade(final int w,final int h,final Shape shape,final int shadeWidth,final float shadeOpacity,final Color clearColor){
        final BufferedImage bi = createCompatibleImage ( width, width, Transparency.TRANSLUCENT );
        final Graphics2D ig = bi.createGraphics ();
        GraphicsUtils.setupAntialias ( ig );
        ig.translate ( shadeWidth, shadeWidth );
        ig.setPaint ( Color.BLACK );
        ig.fill ( shape );
        ig.dispose ();
}
}
