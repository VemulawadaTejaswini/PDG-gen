//67
public class func{
	public void paintLayer(Graphics2D g2,JXLayer<? extends JComponent> layer){
  g2.setPaint(createPaint(drawGlass, false));
  g2.fill(drawGlass);
  g2.setColor(oldColor);
  g2.draw(drawGlass);
  AffineTransform oldTransform = g2.getTransform();
  Shape oldClip = g2.getClip();
  g2.scale(scale, scale);
  g2.clip(clipGlass);
}
}
