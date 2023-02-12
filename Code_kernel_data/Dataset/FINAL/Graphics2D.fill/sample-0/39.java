public class func{
public void drawTransformed(Shape s,Graphics2D g){
    Color oldColor = g.getColor();
    g.setColor(color);
    g.fill(s);
    g.setColor(oldColor);    
}
}
