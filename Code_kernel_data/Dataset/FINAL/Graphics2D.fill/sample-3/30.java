public class func{
public void drawVertex(Graphics2D g2d,PaintContext context,double x,double y){
    g2d.fill(new Rectangle2D.Double(x - 5.0 / scale,
        y - 5.0 / scale, 10.0 / scale, 10.0 / scale));
}
}
