//133
public class func{
	public void paintBorder(Component c,Graphics g,int x,int y,int width,int height){
            Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            path.append(inner, false);
            g2d.fill(path);
            g2d.setColor(oldColor);
}
}
