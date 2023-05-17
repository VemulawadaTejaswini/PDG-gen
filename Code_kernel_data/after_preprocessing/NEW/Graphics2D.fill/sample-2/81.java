//81
public class func{
public void draw(Graphics2D g2,float x,float y,RectangleAnchor anchor){
            Rectangle2D shadow = new Rectangle2D.Double(xx + this.shadowXOffset,
                    yy + this.shadowYOffset, bounds.getWidth(), 
                    bounds.getHeight());
            g2.setPaint(this.shadowPaint);
            g2.fill(shadow);
}
}
