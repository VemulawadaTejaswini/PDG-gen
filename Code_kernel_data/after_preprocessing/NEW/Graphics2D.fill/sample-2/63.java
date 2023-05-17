//63
public class func{
public void createOffImage(final int WIDTH,final int HEIGHT){
        final LinearGradientPaint GLAS_PAINT = new LinearGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.2894736842105263 * IMAGE_HEIGHT), new Point2D.Double(0.5 * IMAGE_WIDTH, 0.7017543859649122 * IMAGE_HEIGHT), new float[]{0.0f, 0.99f, 1.0f}, new Color[]{new Color(0.9333333333f, 0.9333333333f, 0.9333333333f, 1f), new Color(0.6f, 0.6f, 0.6f, 1f), new Color(0.6f, 0.6f, 0.6f, 1f)});
        G2.setPaint(GLAS_PAINT);
        G2.fill(GLAS);
}
}
