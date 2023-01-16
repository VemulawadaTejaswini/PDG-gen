//59
public class func{
	public void paintIndeterminateBar(Graphics2D g,int width,int height){
        if (testValid(0, 0, width, height)) {
            Shape s = shapeGenerator.createProgressBarIndeterminatePattern(0, 0, width, height);
            g.setPaint(getProgressBarIndeterminatePaint(s));
            g.fill(s);
        }
}
}
