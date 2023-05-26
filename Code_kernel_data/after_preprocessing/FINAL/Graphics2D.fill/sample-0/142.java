public class func{
public void drawOuterDecoration(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(26, 24));
    g.setColor(WHITE_ALPHA_7F);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.drawOval(16, 5, 490, 163);
}
}
