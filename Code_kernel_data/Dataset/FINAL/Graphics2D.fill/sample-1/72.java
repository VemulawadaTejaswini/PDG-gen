public class func{
public void fillCircle(final Ellipse2D ell,final IPoint pt,final double width,final Graphics2D g){
    ell.setFrame(pt.getX()-width/2., pt.getY()-width/2., width, width);
    g.fill(ell);
}
}
