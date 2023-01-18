//11
public class func{
	public void paintComponent(Graphics g){
                g2.setPaint(GUIConstants.SELECTION_FILL_COLOUR);
                g2.fill(shape);
                g2.setPaint(GUIConstants.SELECTION_LINE_COLOUR);
                g2.draw(shape);
}
}
