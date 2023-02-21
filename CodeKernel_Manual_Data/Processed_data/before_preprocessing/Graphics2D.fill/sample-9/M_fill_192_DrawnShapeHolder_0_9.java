public class A{
	public void draw(Graphics g) {
		Graphics2D lineG = NapkinUtil.lineGraphics(g, width);
		lineG.draw(shape);
	}
	
	void fill(Graphics g) {
		Graphics2D fillG = NapkinUtil.lineGraphics(g, 1);
		fillG.fill(shape);
	}
}