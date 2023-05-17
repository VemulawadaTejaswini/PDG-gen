public class func{
public void drawHint(Graphics2D g,String text,int x,int y,Color bgColor,Color textColor){
        g2.setStroke(new BasicStroke(1.3f));
        g2.setColor(bgColor);
        mixAlpha(g2, AlphaComposite.SRC_OVER, 1f / 2f);
        g2.fill(backgroundRect);
}
}
