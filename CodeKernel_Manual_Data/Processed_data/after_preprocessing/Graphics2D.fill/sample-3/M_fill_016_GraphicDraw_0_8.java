public class A{
	public static String drawCircleUnit(Graphics2D graphic, int x, int y,int width, int height) {
		Graphics2D g2d = (Graphics2D) graphic.create(x, y, width, height);
		g2d.setColor(Color.blue);
		g2d.fillRect(0, 0, width, height);
		int cx = width / 2;
		int cy = height / 2;
		Shape c = new Ellipse2D.Float(-cx, -cy, cx * 3 / 4, cy * 2);
		g2d.setPaint(new GradientPaint(40, 40, Color.blue, 60, 50, Color.white,true));
		g2d.fill(c);
		return "ok";
	}
}