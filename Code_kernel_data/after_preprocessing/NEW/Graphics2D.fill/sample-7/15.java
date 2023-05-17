//15
public class func{
public void paint(Graphics2D g2){
            g2.setColor(Color.BLACK);
            g2.setComposite(BRIDGE_FILL_COMPOSITE);
            g2.fill(a);
        g2.setComposite(oldComposite);
        meepleLayer.paintMeeplesOnBridges(g2);
}
}
