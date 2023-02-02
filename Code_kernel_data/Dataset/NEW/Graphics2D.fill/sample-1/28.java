//28
public class func{
public void paintBackgroundEnabled(Graphics2D g){
    path = decodePath1();
    g.setPaint(decodeGradient1(path));
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient2(path));
    g.fill(path);
}
}
