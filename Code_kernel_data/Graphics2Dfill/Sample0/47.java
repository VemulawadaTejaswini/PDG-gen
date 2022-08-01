//46
public class func{
	public void drawInnerSubDecoration(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(110, 54));
    g.setColor(GREEN_ALPHA_08);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.setColor(GREEN_ALPHA_48);
    g.draw(shape);
}
}
