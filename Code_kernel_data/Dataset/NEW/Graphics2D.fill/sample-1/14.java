//14
public class func{
public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(color1);
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient1(rect));
    g.fill(rect);
    rect = decodeRect3();
    g.setPaint(decodeGradient2(rect));
    g.fill(rect);
    rect = decodeRect4();
}
}
