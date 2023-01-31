//24
public class func{
	public void draw(Graphics2D g2,Rectangle2D area){
        g2.setPaint(createTransformedGradient(area));
        g2.fill(area);
        g2.setPaint(saved);
}
}
