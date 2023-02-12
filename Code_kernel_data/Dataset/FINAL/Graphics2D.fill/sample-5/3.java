public class func{
public void drawBackGradient(Graphics2D g2d,Rectangle2D rectangle,BiColor colors,int height){
            GradientPaint gragient = new GradientPaint(0, (float) (rectangle.getHeight() - height), colors.getBottomColor(), 0, (float) rectangle.getHeight(), colors.getTopColor());
            g2d.setPaint(gragient);
            g2d.fill(rectangle);
}
}
