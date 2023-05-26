//39
public class func{
public void paintSelection(Graphics2D g2d){
                    g2d.fill ( new RoundRectangle2D.Double ( rect.x + selectionShadeWidth, rect.y + selectionShadeWidth,
                            rect.width - selectionShadeWidth * 2 - 1, rect.height - selectionShadeWidth * 2 - 1, 0,
                            0 ) );
}
}
