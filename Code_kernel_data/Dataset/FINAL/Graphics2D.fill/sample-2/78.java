public class func{
public void paintHandles(Graphics2D g2d,AffineTransform transform){
            for (Point2D point : handlePtArray) {
                g2d.fill(new Rectangle2D.Double(point.getX() - halfSize, point.getY() - halfSize, size, size));
            }
            g2d.setPaint(Color.white);
}
}
