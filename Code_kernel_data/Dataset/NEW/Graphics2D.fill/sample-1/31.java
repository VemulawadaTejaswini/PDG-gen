//31
public class func{
public void paintBackgroundSelectedAndMouseOver(Graphics2D g){
    path = decodePath8();
    g.setPaint(decodeGradient11(path));
    g.fill(path);
    path = decodePath9();
    g.setPaint(decodeGradient12(path));
    g.fill(path);
}
}
