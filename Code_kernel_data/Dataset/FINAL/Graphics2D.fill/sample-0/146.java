public class func{
public void doPaintBackground(Graphics2D g,Rectangle clip,boolean vertical,Rectangle rectangle){
    g.setColor(UIUtil.getPanelBackground());
    g.fill(clip);
}
}
