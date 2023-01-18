//73
public class func{
	public void paint(Graphics2D g2d){
        Area area2 = new Area(outSquare);
        area2.subtract(new Area(midSquare));
        g2d.fill(area2);
}
}
