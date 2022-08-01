//67
public class func{
	public void paintComponent(Graphics g){
            for (int i = 0; i < ticker.length; i++) {
                int channel = 224 - (128 / (i + 1));
                g2.setColor(new Color(channel, channel, channel, alphaLevel));
                g2.fill(ticker[i]);

                Rectangle2D bounds = ticker[i].getBounds2D();

                if (bounds.getMaxY() > maxY) {
                    maxY = bounds.getMaxY();
                }
            }
}
}
