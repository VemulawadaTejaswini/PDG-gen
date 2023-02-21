public class A{
	public void paintComponent(Graphics g) {
		Graphics2D graphics2d = (Graphics2D)g;
		graphics2d.setComposite(composite);
		graphics2d.setBackground(Color.black);
		graphics2d.fill(rect);
	}
}