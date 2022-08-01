//54
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
        if (testValid(0, 0, width - 1, height - 1)) {
            Shape s = shapeGenerator.createRectangle(0, 0, width, height);
            g.setPaint(getTableHeaderPaint(s));
            g.fill(s);

            paintBorder(g, width, height);
        }
}
}
