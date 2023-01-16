//32
public class func{
	public void paintBackgroundDisabledAndEditable(Graphics2D g){
    g.setPaint(color1);
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient1(path));
    g.fill(path);
    path = decodePath3();
}
}
