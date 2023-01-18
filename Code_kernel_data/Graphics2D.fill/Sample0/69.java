//68
public class func{
	public void createClipImage(Graphics2D g,Shape shape){
        g2.fillRect(0, 0, shape.getBounds().width, shape.getBounds().height);
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(shape);
        g2.dispose();
}
}
