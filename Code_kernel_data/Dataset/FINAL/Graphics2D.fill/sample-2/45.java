public class func{
public void drawSelectionShape(Graphics2D g2,boolean xor){
               if (this.selectionFillPaint != null) {
                    g2.setPaint(this.selectionFillPaint);
                    g2.fill(this.selectionShape);
               }
}
}
