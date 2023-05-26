public class func{
public void drawZoomRectangle(ChartPanel panel,Graphics2D g2,boolean xor){
            if (panel.getFillZoomRectangle()) {
                g2.setPaint(panel.getZoomFillPaint());
                g2.fill(this.zoomRectangle);
            }
            else {
                g2.setPaint(panel.getZoomOutlinePaint());
                g2.draw(this.zoomRectangle);
            }
}
}
