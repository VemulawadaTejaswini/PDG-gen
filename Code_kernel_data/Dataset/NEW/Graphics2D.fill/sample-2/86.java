//86
public class func{
public void drawHighlight(Graphics2D g,float x,float y,Color highlightColor){
        g.fill(new Ellipse2D.Double(x - HIGHLIGHT_RADIUS / 2f, y - HIGHLIGHT_RADIUS / 2f, HIGHLIGHT_RADIUS, HIGHLIGHT_RADIUS));
        g.setPaint(oldPaint);
}
}
