public class func{
public void paintBackgroundMouseOverAndFocused(Graphics2D g){
    path = decodePath2();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
    path = decodePath3();
    g.setPaint(decodeGradient6(path));
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient10(path));
    g.fill(path);
    path = decodePath5();
    g.setPaint(decodeGradient8(path));
    g.fill(path);
}
}
