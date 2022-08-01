//109
public class func{
	public void draw(Graphics2D g,Figure f,Point2D.Double p1,Point2D.Double p2){
                color = f.get(STROKE_COLOR);
                color = f.get(FILL_COLOR);
            if (color != null) {
                g.setColor(color);
                g.fill(path);
            }
}
}
