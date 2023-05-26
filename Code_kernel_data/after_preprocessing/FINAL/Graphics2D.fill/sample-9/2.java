public class func{
public void paintImage(Graphics2D g2d,Color color1,Color color2,Color color3){
        g2d.setColor(color1);
        g2d.translate(dim, dim);
        g2d.fill(new Ellipse2D.Double(0, 0, dim, dim));
        g2d.setColor(color2);
        g2d.translate(0, 16);
}
}
