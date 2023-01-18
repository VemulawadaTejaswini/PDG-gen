//16
public class func{
	public void paint(Graphics2D g2d,Rectangle paintArea,WMSMapContent mapContent){
        Rectangle2D bgRect = new Rectangle2D.Double(
            x - 3.0, y - d.getHeight(), 
            d.getWidth() + 6.0, d.getHeight() + 6.0
        );
        g2d.setColor(Color.WHITE);
        g2d.fill(bgRect);
        g2d.setColor(Color.BLACK);
}
}
