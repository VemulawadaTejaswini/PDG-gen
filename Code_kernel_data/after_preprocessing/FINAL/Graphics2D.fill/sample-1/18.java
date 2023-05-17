public class func{
public void paintFocus(Graphics g,AbstractButton b,Rectangle viewRect,Rectangle textRect,Rectangle iconRect){
        g2.setColor(getFocusColor());
        g2.fill(rect);
        Rectangle2D rectFix = new Rectangle((int) width - arc, 0,
            (int) arc, (int) height);
        g2.fill(rectFix);
        g2.dispose();
}
}
