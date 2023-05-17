public class func{
public void drawSelectionHandle(Graphics2D g,float x,float y,Color fillColor,int index){
        if (fillColor != null) {
            g.setColor(fillColor);
            g.fill(SelectionHandle);
        }
}
}
