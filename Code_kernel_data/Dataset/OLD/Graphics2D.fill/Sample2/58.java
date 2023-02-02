//57
public class func{
	public void createRedOnImage(final int WIDTH,final int HEIGHT){
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.5153061224489796f * IMAGE_WIDTH), new float[]{0.0f, 1.0f}, new Color[]{new Color(1f, 0f, 0f, 1f), new Color(0.4627450980f, 0.0196078431f, 0.0039215686f, 0f)}));
        G2.fill(GLOW);
        G2.dispose();
}
}
