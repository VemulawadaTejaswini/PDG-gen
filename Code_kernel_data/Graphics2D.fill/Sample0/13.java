//12
public class func{
	public void paint(Graphics2D g,Rectangle2D rect,String text){
        textBounds = new Rectangle2D.Double(
            x + textBounds.getX(),
            y + textBounds.getY(),
            textBounds.getWidth(),
            textBounds.getHeight()
        );
        RoundRectangle2D background = new RoundRectangle2D.Double(
            textBounds.getX() - ArcRadius / 2,
            textBounds.getY() - ArcRadius / 2,
            textBounds.getWidth() + ArcRadius,
            textBounds.getHeight() + ArcRadius,
            ArcRadius, ArcRadius
        );
        Color oldColor = g.getColor();
        g.setColor(BackColor);
        g.fill(background);
        g.setColor(TextColor);
}
}
