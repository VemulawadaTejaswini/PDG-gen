public class func{
public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
            if (testValid(0, 0, w, h)) {
                Shape s = shapeGenerator.createRectangle(0, 0, w, h);
                Paint background = createVerticalGradient(s, BACKGROUND);
                g.setPaint(background);
                g.fill(s);
                g.setPaint(STROKE);
                g.draw(s);
            }
}
}
