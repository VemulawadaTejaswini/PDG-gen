//58
public class func{
	public void paintArrowhead(Graphics2D g2D,Point p1,Point p2,Double arrowheadPlacement2,Color casingColor,Color fillColor){
        headCore = AffineTransform.getRotateInstance(angle).createTransformedShape(headCore);
        headCore = AffineTransform.getTranslateInstance(pTip.x, pTip.y).createTransformedShape(headCore);
        g2D.fill(headCore);
}
}
