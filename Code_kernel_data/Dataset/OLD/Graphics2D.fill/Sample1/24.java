//23
public class func{
	public void render(Graphics og){
        Color c = new Color(colour.getRed(), colour.getGreen(), 
                  colour.getBlue());
        g.setColor(c);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_ON);
        g.fill(topPoly);
        g.setColor(colour);
        g.fill(bottomPoly);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_OFF);          
        g.setColor(Color.black);
        g.draw(strokeRect);
}
}
