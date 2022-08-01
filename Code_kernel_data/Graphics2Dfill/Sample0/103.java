//102
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
        r = new Rectangle2D.Double(getX() + getWidth() - 2, getY()
                + getHeight() - 2, 4, 4);
}
}
