public class func{
public void paintForegroundEnabledAndFinished(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient5(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient6(rect));
    g.fill(rect);
}
}
