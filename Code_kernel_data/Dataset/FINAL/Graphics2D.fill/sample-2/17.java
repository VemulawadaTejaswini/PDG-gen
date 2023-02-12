public class func{
public void doPaint(Graphics2D g,X object,int width,int height){
            g.setClip(0,0,width,height-1);
        g.setPaint(this.topBevelBackground);
        g.fillRoundRect(10, 0, width-2-20, 20, 20, 20);
        g.setPaint(this.topBevelBorder);
        g.drawRoundRect(10, 0, width-2-20, 20, 20, 20);
        g.setPaint(background);
        g.fill(this.tabAreaCache);
}
}
