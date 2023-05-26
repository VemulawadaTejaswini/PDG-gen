public class func{
public void paintArrowhead(Graphics2D g2D,Point p1,Point p2,Double arrowheadPlacement2,Color casingColor,Color fillColor){
        head = AffineTransform.getRotateInstance(angle).createTransformedShape(head);
        head = AffineTransform.getTranslateInstance(pTip.x, pTip.y).createTransformedShape(head);
        g2D.fill(head);
}
}
