public class func{
public void drawInnerDecoration(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(103, 52));
    g.setColor(DARK_GREEN_ALPHA_80);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.setColor(GLOW_GREEN);
    g.draw(shape);
}
}
