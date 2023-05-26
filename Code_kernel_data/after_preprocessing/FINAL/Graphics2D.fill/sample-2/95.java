public class func{
public void paintBackgroundDefaultAndMouseOver(Graphics2D g){
    g.setPaint(innerBorderMouseOver);
    g.fill(roundRect);
    roundRect = innerFillRect();
}
}
