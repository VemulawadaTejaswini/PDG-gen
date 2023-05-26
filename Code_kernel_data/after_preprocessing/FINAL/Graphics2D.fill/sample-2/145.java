public class func{
public void drawFill(Graphics2D g2,Rectangle2D area){
        g2.setPaint(this.fillPaint);
        g2.fill(filledArea);
        drawBorder(g2, filledArea);
}
}
