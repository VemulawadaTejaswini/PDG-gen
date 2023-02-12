public class func{
public void doPaint(Graphics2D g2,Object o,int i,int i1){
        RoundRectangle2D rect = new RoundRectangle2D.Double(0, 0, c.getWidth() - 1, c.getHeight() - 1, 24, 24);
        g2.fill(rect);
        Ellipse2D ellipse = new Ellipse2D.Double(-c.getWidth(),
                c.getHeight() / 3.0, c.getWidth() * 3.0,
                c.getHeight() * 2.0);
        Area area = new Area(new Rectangle(0, 0, c.getWidth(), c.getHeight()));
        area.subtract(new Area(ellipse));
        area.intersect(new Area(rect));
}
}
