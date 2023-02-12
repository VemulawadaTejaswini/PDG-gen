public class func{
public void paintOverlay(Graphics2D g2,ChartPanel chartPanel){
                g2.setPaint(fillPaint);
                g2.fill(box);
                g2.setStroke(outlineStroke);
                g2.setPaint(outlinePaint);
                g2.draw(box);
                g2.drawString(String.format("x = %.3f", dataPoint.getX()), (int) (dataArea.getX() + 5 + 5), (int) (dataArea.getY() + 5 + 20));
}
}
