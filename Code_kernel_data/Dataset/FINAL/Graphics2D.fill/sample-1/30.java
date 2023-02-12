public class func{
public void paintBackgroundSelectedAndPressedAndFocused(Graphics2D g){
    path = decodePath12();
    g.setPaint(decodeGradient13(path));
    g.fill(path);
    path = decodePath13();
    g.setPaint(decodeGradient14(path));
    g.fill(path);
    path = decodePath14();
}
}
