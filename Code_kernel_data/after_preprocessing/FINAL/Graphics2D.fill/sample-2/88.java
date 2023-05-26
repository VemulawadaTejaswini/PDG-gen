public class func{
public void drawEtchedShape(final Graphics2D g2d,final BufferedImage topBg,final BufferedImage bottomBg,final Shape fullShape,final Shape bevelShape){
        g2d.setPaint ( new TexturePaint ( topBg,
                new Rectangle ( bounds.getLocation (), new Dimension ( topBg.getWidth (), topBg.getHeight () ) ) ) );
        g2d.fill ( fullShape );
        final Shape oldClip = g2d.getClip ();
        final Area newClip = new Area ( oldClip );
}
}
