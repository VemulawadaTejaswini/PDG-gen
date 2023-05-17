public class func{
public void paintBackgroundSelectedAndFocused(Graphics2D g){
    path = decodePath1();
    g.setPaint(decodeGradient10(path));
    g.fill(path);
    path = decodePath10();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
    path = decodePath11();
}
}
