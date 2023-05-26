//11
public class func{
public void paintDragSelection(Graphics2D g){
            g.setColor(DRAG_SELECTION_COLOR);
            g.setStroke(DRAG_SELECTION_STROKE);
            g.fill(r);
            g.drawRect((int) r.getX(), (int) r.getY(), (int) r.getWidth() - 1, (int) r.getHeight() - 1);
}
}
