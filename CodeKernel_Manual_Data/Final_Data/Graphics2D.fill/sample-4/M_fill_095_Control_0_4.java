public class A{
	public Graphics dibujar(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(color);
		g2d.fill(new Ellipse2D.Double(15+PosX,10+PosY,45,40));
		g2d.setColor(Color.black);
		g2d.draw(new Ellipse2D.Double(15+PosX,10+PosY,45,40));
		g2d.fill(Triangulo(28+PosX,5+PosY,12,12));
		g2d.drawString(nombre ,PosX+15 ,PosY+65);
		return g;
	}
}