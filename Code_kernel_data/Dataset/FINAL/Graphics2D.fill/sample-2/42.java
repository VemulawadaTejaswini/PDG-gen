public class func{
public void paintBar(Graphics2D g2,BarRenderer renderer,int row,int column,RectangularShape bar,RectangleEdge base){
        if (t != null && itemPaint instanceof GradientPaint) {
            itemPaint = t.transform((GradientPaint) itemPaint, bar);
        }
        g2.setPaint(itemPaint);
        g2.fill(bar);
}
}
