//33
public class func{
public void paintBackgroundDisabledAndEditable(Graphics2D g){
    g.setPaint(color4);
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient2(path));
    g.fill(path);
}
}
