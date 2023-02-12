public class func{
public void paintComponent(Graphics g){
      UIUtil.drawLine(g2, (int)line.getX1(), (int)line.getY1(), (int)line.getX2(), (int)line.getY2());
      final Shape arrow = LineEndDecorator.getArrowShape(line, line.getP2());
      g2.fill(arrow);
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, old);
}
}
