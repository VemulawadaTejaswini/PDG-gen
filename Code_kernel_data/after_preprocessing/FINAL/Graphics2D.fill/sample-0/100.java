public class func{
public void dot(Graphics2D g2d,Point2D p,double r,Color c){
        g2d.fill(new Ellipse2D.Double(p.getX() - r, p.getY() - r, 2 * r, 2 * r));
        g2d.setColor(old);
}
}
