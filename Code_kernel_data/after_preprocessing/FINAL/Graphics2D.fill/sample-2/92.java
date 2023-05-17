public class func{
public void paintBackgroundDefaultAndFocused(Graphics2D g){
    g.setPaint(focusBorder);
    g.fill(roundRect);
    roundRect = innerBorderRect();
}
}
