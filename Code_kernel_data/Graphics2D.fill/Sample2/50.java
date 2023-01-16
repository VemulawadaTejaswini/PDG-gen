//49
public class func{
	public void defaultDisplay(Graphics2D g2,Shape shape){
        if (this.fillPaint != null) {
            g2.setPaint(this.fillPaint);
            g2.fill(shape);
        }
}
}
