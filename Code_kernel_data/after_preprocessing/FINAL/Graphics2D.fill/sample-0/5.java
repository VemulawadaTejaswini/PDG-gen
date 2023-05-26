public class func{
public void paintLowerThumb(Graphics g){
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.translate(knobBounds.x, knobBounds.y);
            g2d.setColor(Color.CYAN);
            g2d.fill(thumbShape);
            g2d.setColor(Color.BLUE);
            g2d.draw(thumbShape);
            g2d.dispose();
}
}
