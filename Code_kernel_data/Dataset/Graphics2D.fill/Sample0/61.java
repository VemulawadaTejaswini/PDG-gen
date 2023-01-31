//60
public class func{
	public void drawToolTip(Graphics2D g){
      Rectangle2D bg = new Rectangle2D.Double(toolTipX - stringBounds.getWidth() / 2 - 4, toolTipY - stringBounds.getHeight() / 2 - 2, stringBounds.getWidth() + 5, Math.abs(stringBounds.getHeight()) + 3);
      g.fill(bg);
      g.setColor(Color.black);
      g.draw(bg);
}
}
