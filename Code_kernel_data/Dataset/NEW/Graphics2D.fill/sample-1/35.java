//35
public class func{
public void paintBackgroundSelectedAndDisabled(Graphics2D g){
    path = decodePath7();
    g.setPaint(decodeGradient7(path));
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
}
}
