public class func{
public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(color1);
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient1(path));
    g.fill(path);
    path = decodePath3();
    g.setPaint(decodeGradient2(path));
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient3(path));
    g.fill(path);
    path = decodePath5();
    g.setPaint(decodeGradient4(path));
    g.fill(path);
}
}
