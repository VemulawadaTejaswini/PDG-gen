//26
public class func{
	public void paintColorFontOutline(Graphics2D g2,String str,float x,float y,Color color){
        g2.setPaint(Color.BLACK);
        if (RenderingHints.VALUE_TEXT_ANTIALIAS_ON.equals(g2.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING))) {
            TextLayout layout = new TextLayout(str, g2.getFont(), g2.getFontRenderContext());
            Rectangle2D b = layout.getBounds();
            b.setRect(x + b.getX() - 0.75, y + b.getY() - 0.75, b.getWidth() + 1.5, b.getHeight() + 1.5);
            g2.fill(b);
        } else {
            g2.drawString(str, x - 1f, y - 1f);
            g2.drawString(str, x - 1f, y);
            g2.drawString(str, x - 1f, y + 1f);
            g2.drawString(str, x, y - 1f);
            g2.drawString(str, x, y + 1f);
            g2.drawString(str, x + 1f, y - 1f);
            g2.drawString(str, x + 1f, y);
            g2.drawString(str, x + 1f, y + 1f);
        }
        g2.setPaint(color);
        g2.drawString(str, x, y);
}
}
