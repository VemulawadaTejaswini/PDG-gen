public class A{
	//...
	public static void main(){
		Graphics2D g2d = (Graphics2D) graphic.create(x, y, width, height);
		//...
		Shape c = new Ellipse2D.Float(-cx, -cy, cx * 3 / 4, cy * 2);
		//...
		g2d.fill(c);
	}
}