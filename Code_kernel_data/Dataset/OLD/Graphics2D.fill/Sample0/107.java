//106
public class func{
	public void paint(Graphics2D graphics){
    if (fillColor != Color.NONE) {
      graphics.setColor(fillColor.toAWTColor());
      graphics.fill(shape);
    }
    if (strokeColor != Color.NONE) {
      float[] dashArray = getDashArray();
      if (dashArray.length == 0)
        dashArray = null;
      graphics.setColor(strokeColor.toAWTColor());
      graphics.setStroke(new BasicStroke(getStrokeWidth(),
          getStrokeCap().value, getStrokeJoin().value,
          getMiterLimit(), dashArray,
          getDashOffset()));
      graphics.draw(shape);
    }
}
}
