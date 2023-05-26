//3
public class func{
public void paintImage(Graphics2D g2d,Color color){
        g2d.setColor(color);
        g2d.translate(dim, dim);
        g2d.fill(new Ellipse2D.Double(0, 0, dim, dim));
}
}
