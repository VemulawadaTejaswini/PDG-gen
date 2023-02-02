//2
public class func{
public void highlightPivot(Graphics2D g,MapView mv,EastNorth pivot){
        Shape pvCentrePoint = new Ellipse2D.Double(
                mv.getPoint(pivot).getX() - 5.0f,
                mv.getPoint(pivot).getY() - 5.0f, 10.0f, 10.0f);
        g.fill(pvCentrePoint);
        Shape pvPoint = new Ellipse2D.Double(mv.getPoint(pivot).getX() - 8.0f,
                mv.getPoint(pivot).getY() - 8.0f, 16.0f, 16.0f);
        g.draw(pvPoint);
}
}
