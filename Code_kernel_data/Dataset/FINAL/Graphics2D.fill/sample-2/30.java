public class func{
public void paintSafely(Graphics g){
            g2d.setStroke(new BasicStroke(shadeWidth * 2));
            g2d.setPaint(Color.LIGHT_GRAY);
            g2d.draw(border);
            g2d.setStroke(os);
            g2d.setPaint(Color.WHITE);
            g2d.fill(border);
}
}
