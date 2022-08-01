//40
public class func{
	public void paintThumb(Graphics g,JComponent c,Rectangle thumbBounds){
        g2.setColor(borderUIColor != null ? borderUIColor : fgUIColor);
        g2.fill(thumbBounds);
        g2.setColor(bgUIColor);
        g2.drawLine(x-w, y+2, x+w, y+2);
}
}
