public class func{
public void drawCustomWebBorder(final Graphics2D g2d,final JComponent component,final Shape borderShape,final Color shadeColor,final int shadeWidth,final boolean fillBackground,final boolean webColored,final Color border,final Color disabledBorder,final Color backgroundColor){
                g2d.setPaint ( new GradientPaint ( 0, shapeBounds.y, StyleConstants.topBgColor, 0, shapeBounds.y + shapeBounds.height,
                        StyleConstants.bottomBgColor ) );
                g2d.fill ( borderShape );
}
}
