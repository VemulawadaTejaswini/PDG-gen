public class func{
public void fillPaintedShape(Graphics2D graphics,Shape shape,Paint paint,Rectangle2D paintBounds){
    AffineTransform tx = AffineTransform.getScaleInstance(
        1.0/paintBounds.getWidth(), 1.0/paintBounds.getHeight());
    tx.translate(-paintBounds.getX(), -paintBounds.getY());
    graphics.fill(tx.createTransformedShape(shape));
    if (paintOld != null) {
      graphics.setPaint(paintOld);
    }
    graphics.setTransform(txOrig);
}
}
