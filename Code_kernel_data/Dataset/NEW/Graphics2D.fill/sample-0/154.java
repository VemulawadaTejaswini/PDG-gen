//154
public class func{
public void draw(Graphics2D g2,Rectangle2D area){
        ParamChecks.nullNotPermitted(area, "area");
        g2.setColor(this.color);
        g2.fill(area);
}
}
