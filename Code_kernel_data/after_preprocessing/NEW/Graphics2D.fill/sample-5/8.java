//8
public class func{
public void drawGradient(Graphics2D g2d,Shape shape,BiColor colors,int height){
        if (colors != null) {
            GradientPaint gragient = new GradientPaint(0, 0, colors.getTopColor(), 0, height, colors.getBottomColor());
            g2d.setPaint(gragient);
            g2d.fill(shape);
        }
}
}
