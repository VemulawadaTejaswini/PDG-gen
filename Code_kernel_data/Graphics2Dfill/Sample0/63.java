//62
public class func{
	public void drawToolTip(Graphics2D g,double dx,double dy,double sx,double sy){
      Rectangle2D bg = new Rectangle2D.Double((toolTipX + dx) * sx - stringBounds.getWidth() / 2 - 4, (toolTipY + dy) * sy + 3, stringBounds.getWidth() + 5, Math.abs(stringBounds.getHeight()) + 3);
      g.fill(bg);
      g.setColor(Color.black);
      g.draw(bg);
}
}
