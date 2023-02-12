public class func{
public void paintDecoration(final Graphics2D g,final Graphics2D gstroke,final double x0,final double y0,final double x1,final double y1,double dx,double dy,double dxn,double dyn){
    final double middleDistanceToConvexHull = getDistanceToConvexHull();
      final double distanceToConvexHull = middleDistanceToConvexHull * 2.2 * random(0.7);
    final Shape shape = new QuadCurve2D.Double(x0, y0, xctrl, yctrl, x1, y1);
    g.fill(shape);
    gstroke.draw(shape);
}
}
