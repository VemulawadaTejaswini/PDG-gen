public class func{
public void render(Graphics2D gfx){
        gfx.setColor(getBackground());
        gfx.fill(_shape);
        gfx.setColor(_outline);
        gfx.draw(_shape);
        SwingUtil.restoreAntiAliasing(gfx, oalias);
}
}
