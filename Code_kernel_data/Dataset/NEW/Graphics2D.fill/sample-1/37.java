//37
public class func{
public void paintBackgroundEnabledAndMouseOver(Graphics2D g){
    path = decodePath1();
    g.setPaint(decodeGradient3(path));
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient4(path));
    g.fill(path);
}
}
