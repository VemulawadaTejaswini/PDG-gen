//11
public class func{
	public void drawBB(java.awt.Graphics2D g,ProjectionRect bb,Color fillColor){
    if (null != fillColor) {
      g.setColor(fillColor);
      g.fill(rect);
    }
    g.setColor(outlineColor);
    g.draw(rect);
}
}
