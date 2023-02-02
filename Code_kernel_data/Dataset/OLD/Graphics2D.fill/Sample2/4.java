//3
public class func{
	public void drawLabel(Rendering rendering,String label){
            for (int i = 0; i < labelOutlineAlphas.length; i++) {
                graphics.setStroke(labelOutlineStrokes[i]);
                graphics.setPaint(labelOutlineColors[i]);
                graphics.draw(labelOutline);
            }
            graphics.setPaint(labelFontColor);
            graphics.fill(labelOutline);
            graphics.setPaint(oldPaint);
            graphics.setStroke(oldStroke);
            graphics.setFont(oldFont);
}
}
