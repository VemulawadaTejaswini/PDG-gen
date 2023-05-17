public class func{
public void paintComponent(Graphics graphics){
        Paint oldPaint = g.getPaint();
        g.setPaint(Color.WHITE);
        g.fill(clipBounds);
        g.setPaint(oldPaint);
}
}
