//58
public class func{
public void create_BEAM_Image(final int WIDTH){
        final Ellipse2D BEAM_AREA = new Ellipse2D.Double(IMAGE_WIDTH * 0.08411215245723724, IMAGE_HEIGHT * 0.08411215245723724, IMAGE_WIDTH * 0.8317756652832031, IMAGE_HEIGHT * 0.8317756652832031);
        final ConicalGradientPaint BEAM_GRADIENT = new ConicalGradientPaint(true, BEAM_CENTER, 0, BEAMAREA_FRACTIONS, BEAMAREA_COLORS);
        G2.setPaint(BEAM_GRADIENT);
        G2.fill(BEAM_AREA);
        G2.dispose();
}
}
