//166
public class func{
	public void clearRegion(Graphics2D g,Rectangle2D r){
        g.setColor(getBackground());
        g.fill(r);
        firePrePaint(g);
}
}
