public class func{
public void createImageShade(final int w,final int h,final Shape shape,final int shadeWidth,final float shadeOpacity,final Color clearColor){
            g2d.setComposite ( AlphaComposite.getInstance ( AlphaComposite.SRC_IN ) );
            g2d.setPaint ( clearColor );
            g2d.fill ( shape );
            g2d.dispose ();
}
}
