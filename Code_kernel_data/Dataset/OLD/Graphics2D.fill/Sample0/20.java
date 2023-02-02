//19
public class func{
	public void drawInnerCircle(final Graphics2D g2,final double theCenterX,final double theCenterY,final double innerRadius){
        g2.setColor(Color.white);
        g2.fill(innerCircle);
        g2.setColor(Color.black);
        g2.draw(innerCircle);
        drawCross(g2, (int) theCenterX, (int) theCenterY, lineLength, lineLength);
}
}
