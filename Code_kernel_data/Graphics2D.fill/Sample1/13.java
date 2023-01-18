//12
public class func{
	public void debugVisibleArea(Graphics2D g){
    ellipse.setFrame(camera.getViewCenter().x - 3 * px1,
        camera.getViewCenter().y - 3 * px1, px1 * 6, px1 * 6);
    g.fill(ellipse);
    ellipse.setFrame(metrics.lo.x - 3 * px1, metrics.lo.y - 3 * px1,
        px1 * 6, px1 * 6);
    g.fill(ellipse);
    ellipse.setFrame(metrics.hi.x - 3 * px1, metrics.hi.y - 3 * px1,
        px1 * 6, px1 * 6);
    g.fill(ellipse);
}
}
