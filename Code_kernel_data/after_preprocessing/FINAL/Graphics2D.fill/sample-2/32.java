public class func{
public void paintOverlay(Graphics2D g2,ChartPanel chartPanel){
                g2.setPaint(fillPaint);
                g2.fill(ellipse);
                g2.setStroke(outlineStroke);
                g2.setPaint(outlinePaint);
                g2.draw(ellipse);
}
}
