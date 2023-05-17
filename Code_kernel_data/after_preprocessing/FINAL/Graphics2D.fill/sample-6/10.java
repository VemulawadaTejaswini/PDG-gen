public class func{
public void paintActiveArea(Graphics2D g2){
    g2.setColor(LAFConstants.getCurveEditorActiveBackgroundColor());
    g2.draw(activeAreaRectangle);
    g2.fill(activeAreaRectangle);
}
}
