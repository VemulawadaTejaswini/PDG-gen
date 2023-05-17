//71
public class func{
public void paintBodyOval(DisplayedGem displayedGem,Paint paint,Graphics2D g2d){
        Object oldAntiAliasRenderingHint = g2d.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(paint);
        g2d.fill(bodyShape);
        g2d.setColor(Color.black);
        g2d.draw(bodyShape);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, oldAntiAliasRenderingHint);
}
}
