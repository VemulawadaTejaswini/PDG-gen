public class func{
public void createGradientMask(int width,int height,int orientation){
        GradientPaint paint = new GradientPaint(0.0f, 0.0f,
                new Color(1.0f, 1.0f, 1.0f, 1.0f),
                orientation == SwingConstants.HORIZONTAL? width : 0.0f, 
                orientation == SwingConstants.VERTICAL? height : 0.0f,
                new Color(1.0f, 1.0f, 1.0f, 0.0f));
        g.setPaint(paint);
        g.fill(new Rectangle2D.Double(0, 0, width, height));
        g.dispose();
}
}
