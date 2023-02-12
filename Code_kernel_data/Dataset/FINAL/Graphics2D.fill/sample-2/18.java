public class func{
public void fillNormalGradient(Graphics2D g2d,Shape s,Color startColor,Color endColor,boolean isVertical){
        Paint old = g2d.getPaint();
        g2d.setPaint(paint);
        g2d.fill(s);
        g2d.setPaint(old);
}
}
