public class func{
public void drawFill(Graphics2D g){
        double grow = AttributeKeys.getPerpendicularFillGrowth(this);
        Geom.grow(r, grow, grow);
        g.fill(r);
}
}
