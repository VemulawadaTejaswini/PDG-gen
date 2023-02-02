//5
public class func{
public void paintComponent(final Graphics g){
                g2d.setPaint ( new LinearGradientPaint ( 0, 0, 0, getHeight (), new float[]{ 0f, 0.4f, 0.6f, 1f },
                        new Color[]{ StyleConstants.bottomBgColor, Color.WHITE, Color.WHITE, StyleConstants.bottomBgColor } ) );
                g2d.fill ( g2d.getClip () != null ? g2d.getClip () : getVisibleRect () );
}
}
