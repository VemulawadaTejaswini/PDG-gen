//58
public class func{
	public void drawToolTip(Graphics2D g){
      Rectangle2D bg = new Rectangle2D.Double((toolTipX) - stringBounds.getWidth() - 15, (toolTipY - (stringBounds.getHeight() / 2)), stringBounds.getWidth() + 6, Math.abs(stringBounds.getHeight()) + 4);
      g.fill(bg);
      g.setColor(Color.black);
      g.draw(bg);
      g.drawString(currentToolTip, (float) ((toolTipX ) - stringBounds.getWidth() - 12 ), (float) ((toolTipY + stringBounds.getHeight() * 0.5) + 1));
}
}
