//14
public class func{
public void paintTrack(Graphics g,JComponent c,Rectangle trackBounds){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(background);
        g2.fill(trackBounds);
        g2.setColor(foreground);
        g2.draw(trackBounds);
}
}
