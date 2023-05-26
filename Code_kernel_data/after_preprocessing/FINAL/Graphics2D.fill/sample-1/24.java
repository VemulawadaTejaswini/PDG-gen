public class func{
public void paintForegroundDisabledAndFinished(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient9(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient10(rect));
    g.fill(rect);
}
}
