//38
public class func{
public void paintBarShadow(Graphics2D g2,BarRenderer renderer,int row,int column,RectangularShape bar,RectangleEdge base,boolean pegShadow){
        Paint itemPaint = renderer.getItemPaint(row, column);
        if (itemPaint instanceof Color) {
            Color c = (Color) itemPaint;
            if (c.getAlpha() == 0) {
                return;
            }
        }
        RectangularShape shadow = createShadow(bar, renderer.getShadowXOffset(),
                renderer.getShadowYOffset(), base, pegShadow);
        g2.setPaint(renderer.getShadowPaint());
        g2.fill(shadow);
}
}
