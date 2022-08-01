//16
public class func{
	public void paintIcyBackGround(int width,int height,Graphics g){
        g2.setPaint(new GradientPaint(0, 0, Color.white.darker(), 0, height / 1.5f, Color.black));
        g2.fill(roundRect);
        g2.setPaint(Color.black);
        g2.setColor(Color.black);
        mixAlpha(g2, AlphaComposite.SRC_OVER, 1f / 3f);
        g2.fillOval(-width + (width / 2), height / 2, width * 2, height);
        mixAlpha(g2, AlphaComposite.SRC_OVER, 3f / 1f);
}
}
