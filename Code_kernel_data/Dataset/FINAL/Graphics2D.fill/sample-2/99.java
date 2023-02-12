public class func{
public void paintLayer(Graphics2D g2,JXLayer<? extends JComponent> layer){
  g2.setPaint(createPaint(drawGlass, true));
  g2.fill(drawGlass);
}
}
