public class func{
public void drawEtchedShape(final Graphics2D g2d,final BufferedImage topBg,final BufferedImage bottomBg,final Shape fullShape,final Shape bevelShape){
        g2d.setPaint ( new TexturePaint ( bottomBg,
                new Rectangle ( bounds.getLocation (), new Dimension ( bottomBg.getWidth (), bottomBg.getHeight () ) ) ) );
        g2d.fill ( bevelShape );
        GraphicsUtils.drawShade ( g2d, bevelShape, Color.BLACK, 4 );
        g2d.setClip ( oldClip );
        g2d.setPaint ( Color.DARK_GRAY );
        g2d.draw ( bevelShape );
        GraphicsUtils.restoreAntialias ( g2d, aa );
}
}
