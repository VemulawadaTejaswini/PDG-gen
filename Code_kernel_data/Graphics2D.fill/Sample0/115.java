//114
public class func{
	public void paint(Graphics2D g2d,State state){
                    g2d.setComposite(((AlphaComposite) old).derive(1f));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fill(circle);
                g2d.setComposite(old);
}
}
