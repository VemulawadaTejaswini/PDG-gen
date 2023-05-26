//40
public class func{
public void paintBackgroundEnabled(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient1(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient2(rect));
    g.fill(rect);
}
}
