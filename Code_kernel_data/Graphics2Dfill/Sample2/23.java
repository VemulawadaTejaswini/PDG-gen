//22
public class func{
	public void paintComponent(Graphics graphics){
        Paint oldPaint = g.getPaint();
        g.setPaint(COLOR_BACKGROUND);
        g.fill(clipBounds);
        g.setPaint(oldPaint);
}
}
