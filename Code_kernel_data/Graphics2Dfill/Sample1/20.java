//19
public class func{
	public void paint(Graphics2D g2){
                g2.setPaint(textures.createMultiColor(fh.colors));
                g2.fill(area);
                g2.setPaint(textures.create(fh.colors[0]));
                g2.fill(area);
        g2.setPaint(null);
        g2.setComposite(old);
}
}
