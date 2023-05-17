public class func{
public void create3LightsYellowImage(final int WIDTH,final int HEIGHT,final boolean IS_ON){
            final Ellipse2D OFF = new Ellipse2D.Double(0.1875 * IMAGE_WIDTH, 0.38 * IMAGE_HEIGHT, 0.625 * IMAGE_WIDTH, 0.25 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.585 * IMAGE_HEIGHT), (0.59375f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 0.99f, 1.0f}, new Color[]{new Color(0.3254901961f, 0.3333333333f, 0f, 1f), new Color(0.0039215686f, 0.0039215686f, 0f, 1f), new Color(0f, 0f, 0f, 1f), new Color(0f, 0f, 0f, 1f)}));
            G2.fill(OFF);
            final Ellipse2D HIGHLIGHT_OFF = new Ellipse2D.Double(0.2625 * IMAGE_WIDTH, 0.385 * IMAGE_HEIGHT, 0.4625 * IMAGE_WIDTH, 0.1 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.405 * IMAGE_HEIGHT), (0.2125f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 0.2235294118f), new Color(1f, 1f, 1f, 0.0274509804f), new Color(1f, 1f, 1f, 0.0274509804f)}));
            G2.fill(HIGHLIGHT_OFF);
            final Ellipse2D GLOW = new Ellipse2D.Double(0.0 * IMAGE_WIDTH, 0.3 * IMAGE_HEIGHT, 1.0 * IMAGE_WIDTH, 0.4 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.5 * IMAGE_HEIGHT), (0.5f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 0.99f, 1.0f}, new Color[]{new Color(1f, 1f, 0f, 1f), new Color(1f, 1f, 0f, 0f), new Color(1f, 1f, 0f, 0f), new Color(1f, 1f, 0f, 0f)}));
            G2.fill(GLOW);
            final Ellipse2D ON = new Ellipse2D.Double(0.1875 * IMAGE_WIDTH, 0.38 * IMAGE_HEIGHT, 0.625 * IMAGE_WIDTH, 0.25 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.585 * IMAGE_HEIGHT), (0.59375f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 0.99f, 1.0f}, new Color[]{new Color(1f, 1f, 0f, 1f), new Color(0.3333333333f, 0.3411764706f, 0f, 1f), new Color(0.3254901961f, 0.3333333333f, 0f, 1f), new Color(0.3254901961f, 0.3333333333f, 0f, 1f)}));
            G2.fill(ON);
            final Ellipse2D HIGHLIGHT_ON = new Ellipse2D.Double(0.2625 * IMAGE_WIDTH, 0.385 * IMAGE_HEIGHT, 0.4625 * IMAGE_WIDTH, 0.1 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.405 * IMAGE_HEIGHT), (0.2125f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 0.6745098039f), new Color(1f, 1f, 1f, 0.0862745098f), new Color(1f, 1f, 1f, 0.0862745098f)}));
            G2.fill(HIGHLIGHT_ON);
        final Ellipse2D INNER_SHADOW = new Ellipse2D.Double(0.1875 * IMAGE_WIDTH, 0.38 * IMAGE_HEIGHT, 0.625 * IMAGE_WIDTH, 0.25 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.505 * IMAGE_HEIGHT), (0.3125f * IMAGE_WIDTH), new float[]{0.0f, 0.55f, 0.5501f, 0.78f, 0.79f, 1.0f}, new Color[]{new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0.1215686275f), new Color(0f, 0f, 0f, 0.1294117647f), new Color(0f, 0f, 0f, 0.4980392157f)}));
        G2.fill(INNER_SHADOW);
        G2.dispose();
}
}
