public class func{
public void primitivePaint(Graphics2D g2d){
        if (backgroundPaint != null) {
            g2d.setPaint(backgroundPaint);
            g2d.fill(g2d.getClip());
        }
}
}
