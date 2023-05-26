//15
public class func{
public void draw(ColorMapper mapper,Graphics2D g2d){
    final GradientPaint paint = new GradientPaint(0, 0, mapper.getMappedColor(c1), (float) width, (float) height,
        mapper.getMappedColor(c2));
    final RoundRectangle2D r = new RoundRectangle2D.Double(0, 0, width, height, corner * 2, corner * 2);
    g2d.setPaint(paint);
    g2d.fill(r);
}
}
