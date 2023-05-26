public class func{
public void draw(Graphics2D g2,Point p){
    GradientPaint gradient = new GradientPaint(x, y, Color.RED, x + 50, y,
        Color.WHITE);
    g2.setPaint(gradient);
    g2.fill(new Ellipse2D.Double(x, y, 50, 50));
}
}
