//0
public class func{
public void drawRobocodeText(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(121, 88));
    g.setColor(GREEN_ALPHA_40);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.setColor(GREEN_ALPHA_80);
    g.draw(shape);
}
}
