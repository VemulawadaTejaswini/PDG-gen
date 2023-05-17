public class func{
public void draw(Graphics2D g2,Rectangle2D chartArea,Point2D anchor,ChartRenderingInfo info){
                int row = entity.getDataset().getRowIndex(entity.getRowKey());
                int column = entity.getDataset().getColumnIndex(entity.getColumnKey());
                java.awt.Color baseColor = (java.awt.Color) renderer.getItemPaint(row, column);
                g2.setPaint(baseColor);
                g2.fill(area);
}
}
