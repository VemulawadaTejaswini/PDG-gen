public class func{
public void paintComponent(Graphics g){
      g2.setPaint(new GradientPaint(0, 0, getBackground(), getWidth(), 0,
          gradientColor));
      g2.fill(rect);
}
}
