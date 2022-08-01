//21
public class func{
	public void createRedOffImage(final int WIDTH,final int HEIGHT){
        final int IMAGE_WIDTH = IMAGE.getWidth();
        final int IMAGE_HEIGHT = IMAGE.getHeight();
        final Ellipse2D LIGHT_OFF = new Ellipse2D.Double(0.17346938775510204 * IMAGE_WIDTH, 0.07553956834532374 * IMAGE_HEIGHT, 0.6530612244897959 * IMAGE_WIDTH, 0.2302158273381295 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.32653061224489793f * IMAGE_WIDTH), new float[]{0.0f, 1.0f}, new Color[]{new Color(1f, 0f, 0f, 0.2470588235f), new Color(1f, 0f, 0f, 0.0470588235f)}));
        G2.fill(LIGHT_OFF);
        final Ellipse2D INNER_SHADOW = new Ellipse2D.Double(0.17346938775510204 * IMAGE_WIDTH, 0.07553956834532374 * IMAGE_HEIGHT, 0.6530612244897959 * IMAGE_WIDTH, 0.2302158273381295 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.32653061224489793f * IMAGE_WIDTH), new float[]{0.0f, 0.55f, 0.5501f, 0.78f, 0.79f, 1.0f}, new Color[]{new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0.1215686275f), new Color(0f, 0f, 0f, 0.1294117647f), new Color(0f, 0f, 0f, 0.4980392157f)}));
        G2.fill(INNER_SHADOW);
}
}
