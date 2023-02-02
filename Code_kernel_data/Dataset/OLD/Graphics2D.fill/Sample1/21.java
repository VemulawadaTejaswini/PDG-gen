//20
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
            g.setColor(SkinColors.SCROLL_THUMB_BORDER_COLOR);
            g.fill(s1);
            Shape s2 = shapeGenerator.createRectangle(1, 1, width - 2, height - 1);
            g.setPaint(getScrollBarThumbPaint(s2));
            g.fill(s2);
}
}
