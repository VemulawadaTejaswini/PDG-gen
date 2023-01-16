//29
public class func{
	public void paint(Graphics2D g2d,Rectangle paintArea,WMSMapContent mapContent){
                g2d.setStroke(new BasicStroke(2 * haloRadius, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2d.draw(outline);
            g2d.setFont(font);
            g2d.setColor(fontColor);
            g2d.fill(outline);
            g2d.setColor(oldColor);
            g2d.setFont(oldFont);
            g2d.setStroke(oldStroke);
}
}
