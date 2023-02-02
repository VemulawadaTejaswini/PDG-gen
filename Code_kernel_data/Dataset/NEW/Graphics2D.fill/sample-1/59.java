//59
public class func{
public void paintChannel(final Channel channel,final Graphics2D g,final MapView mv){
        double angle = angleFromXAxis(fromPoint, toPoint);
        head = AffineTransform.getRotateInstance(angle).createTransformedShape(head);
        head = AffineTransform.getTranslateInstance(toPoint.x, toPoint.y).createTransformedShape(head);
        g.fill(head);
}
}
