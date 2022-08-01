//4
public class func{
	public void drawTextBox(Graphics2D g2D,String text,int x0,int y0,Color color){
        final FontMetrics fontMetrics = g2D.getFontMetrics();
        final Rectangle2D textBounds = fontMetrics.getStringBounds(text, g2D);
        x0 -= textBounds.getWidth() / 2;
        textBounds.setRect(textBounds.getX() - 1, textBounds.getY(), textBounds.getWidth(), textBounds.getHeight());
        Rectangle2D.Double r = new Rectangle2D.Double(x0 + textBounds.getX() - 2.0,
                                                      y0 + textBounds.getY() - 2.0,
                                                      textBounds.getWidth() + 4.0,
                                                      textBounds.getHeight() + 4.0);
        if (r.getMaxX() > getWidth()) {
            r.setRect(getWidth() - r.getWidth(), r.getY(), r.getWidth(), r.getHeight());
        }
        if (r.getMinX() < 0) {
            r.setRect(0, r.getY(), r.getWidth(), r.getHeight());
        }
        if (r.getMaxY() > getHeight()) {
            r.setRect(r.getX(), getHeight() - r.getHeight(), r.getWidth(), r.getHeight());
        }
        if (r.getMinY() < 0) {
            r.setRect(r.getX(), 0, r.getWidth(), r.getHeight());
        }
        g2D.setColor(color);
        g2D.fill(r);
        g2D.setColor(Color.black);
        g2D.draw(r);
        g2D.drawString(text, x0, y0);
}
}
