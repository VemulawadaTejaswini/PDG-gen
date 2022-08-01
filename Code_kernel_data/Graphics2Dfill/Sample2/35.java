//34
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
        if (testValid(0, 0, width, height)) {
            Shape s = shapeGenerator.createRectangle(0, 0, width, height);
            g.setPaint(getScrollBarTrackPaint(s));
            g.fill(s);

            g.setColor(SkinColors.SCROLL_TRACK_BORDER_COLOR);
            g.draw(s);
        }
}
}
