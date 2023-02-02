//4
public class func{
public void paint(Graphics2D g2d){
        GradientPaint paint = new GradientPaint((float) 3, (float) 3, gradientColorStart, (float) DIMENSIONS.getWidth() - 2,
            (float) DIMENSIONS.getHeight() - 2, gradientColorEnd);
        g2d.setPaint(paint);
        g2d.fill(inSquare);
        Ellipse2D outSquare = new Ellipse2D.Double(0, 0, DIMENSIONS.getWidth(), DIMENSIONS.getHeight());
        Ellipse2D midSquare = new Ellipse2D.Double(1, 1, DIMENSIONS.getWidth() - 2, DIMENSIONS.getHeight() - 2);
}
}
