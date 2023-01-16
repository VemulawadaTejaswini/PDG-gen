//6
public class func{
	public void paintComponent(Graphics g){
            for (int i = 0; i < ticker.length; i++) {
                int channel = 224 - (128 / (i + 1));
                g2.setColor(new Color(channel, channel, channel, 100));
                g2.fill(ticker[i]);


                try {
                    Rectangle2D bounds = ticker[i].getBounds2D();

                    if (bounds.getMaxY() > maxY) {
                        maxY = bounds.getMaxY();
                    }
                } catch (ArrayIndexOutOfBoundsException ae) {
                    //
                }
            }
            g2.setColor(UIHelper.GREY_COLOR);
            g2.setFont(UIHelper.VER_10_BOLD);
            FontMetrics fm = g2.getFontMetrics(g2.getFont());
            int stringSize = fm.stringWidth(text);
}
}
