//9
public class func{
	public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(SELECTION_COLOR);
        g2d.fill(selectionRectangle);
        g2d.setPaint(SELECTION_COLOR_OUTLINE);
        g2d.draw(selectionRectangle);
}
}
