public class A{
	public void draw(Graphics2D g2d){
		g2d.draw(this);
		setAnchor();
		g2d.fill(ellipse[0]);
		g2d.fill(ellipse[1]);
		
	}
}