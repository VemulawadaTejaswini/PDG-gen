//74
public class func{
	public void paint(Graphics2D g2d){
        Area area = new Area(midSquare);
        area.subtract(new Area(inSquare));
        g2d.fill(area);
}
}
