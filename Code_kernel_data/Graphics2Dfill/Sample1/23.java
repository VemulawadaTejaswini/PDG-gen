//22
public class func{
	public void paintComponent(final Graphics g){
        final Shape rf2 = new Rectangle2D.Float(0.0f, 0.0f, getWidth(), getHeight());
        final Shape rf1 = new Rectangle2D.Float(3.0f,
                                                getHeight() * 0.5f,
                                                getWidth() - 6,
                                                (float) (getHeight() * 0.5 - 3));
        g2.setPaint(gp2);
        g2.fill(rf2);
        g2.setPaint(gp1);
        g2.fill(rf1);
}
}
