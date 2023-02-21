public class A{
	public void draw(Graphics2D g){
		if (!visible)return;
		g.setPaint(color);
		g.fill(this.rect);
	}
}