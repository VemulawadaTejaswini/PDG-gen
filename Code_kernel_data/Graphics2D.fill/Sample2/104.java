//103
public class func{
	public void fill(PDFRenderer state,Graphics2D g,GeneralPath s){
        g.setPaint(this.mainPaint);
        g.fill(s);
        return s.createTransformedShape(g.getTransform()).getBounds2D();
}
}
