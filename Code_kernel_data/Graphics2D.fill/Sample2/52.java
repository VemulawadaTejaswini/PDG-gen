//51
public class func{
	public void create_POI_Image(final int WIDTH){
        final java.awt.RadialGradientPaint GRADIENT = new java.awt.RadialGradientPaint(CENTER, (int) (WIDTH / 2.0), FRACTIONS, COLORS);
        G2.setPaint(GRADIENT);
        G2.fill(BLIP);
        G2.dispose();
}
}
