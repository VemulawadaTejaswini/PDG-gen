//85
public class func{
	public void fill(Graphics2D g2d){
        final Shape old = g2d.getClip();
        g2d.clip(clip);
        g2d.fill(area);
        g2d.setClip(old);
}
}
