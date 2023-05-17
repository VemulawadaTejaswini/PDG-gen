//2
public class func{
public void drawInsideVertex(final Graphics2D g2d,final Vertex v,final Color[] colors,final double x,final double y,final float height,final float width){
                final Paint p = new GradientPaint((float) x + width / number,
                                                  (float) y,
                                                  getVertexFillSecondaryColor(v),
                                                  (float) x + width / number,
                                                  (float) y + height,
                                                  colors[i],
                                                  false);
                g2d.setPaint(p);
                final Shape s = new Rectangle2D.Double(x + width / 2 + (width / number / 2) * i,
                                                       y,
                                                       width / number / 2,
                                                       height - 2);
                g2d.fill(s);
}
}
