//59
public class func{
	public void drawToolTip(Graphics2D g,ToolTip toolTip){
            Rectangle2D bg = new Rectangle2D.Double(toolTip.getX() - stringBounds.getWidth() / 2 - 4, toolTip.getY() - stringBounds.getHeight() / 2, stringBounds.getWidth() + 5, stringBounds.getHeight() + 3);
            g.fill(bg);
            g.setColor(Color.black);
            g.draw(bg);
            g.drawString(toolTip.getText(), (int) (toolTip.getX() - stringBounds.getWidth() / 2 - 2), toolTip.getY() + 6);
}
}
