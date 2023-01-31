//42
public class func{
	public void drawShadow(Graphics2D g2d,Shape shape,double deltaShadow,double dpiFactor){
        gg.setColor(colorLine);
        gg.draw(shape);
        gg.setColor(color);
        gg.fill(shape);
      gg.dispose();
}
}
