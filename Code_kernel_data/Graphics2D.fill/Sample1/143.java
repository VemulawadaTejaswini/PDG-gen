//142
public class func{
	public void paintOutputPart(DisplayedGem displayedGem,Graphics2D g2d){
        Polygon bindPoint = displayedGem.getDisplayedGemShape().getOutputShape();
        g2d.fill(bindPoint);
}
}
