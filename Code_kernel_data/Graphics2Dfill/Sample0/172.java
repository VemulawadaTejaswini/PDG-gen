//171
public class func{
	public void paintBetween(Graphics2D gfx,Rectangle dirtyRect){
        gfx.setColor(Color.gray);
        gfx.fill(dirtyRect);
        _spritemgr.renderSpritePaths(gfx);
}
}
