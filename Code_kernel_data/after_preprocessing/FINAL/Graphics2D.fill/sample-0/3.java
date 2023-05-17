public class func{
public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(startX, startY);
        g2d.rotate(Math.atan2(ey, ex));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setComposite(composite);
        g2d.setColor(this.color);
        g2d.fill(arrow);
        g2d.setColor(Color.BLACK);
        g2d.draw(arrow);
}
}
