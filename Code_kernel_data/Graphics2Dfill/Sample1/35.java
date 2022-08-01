//34
public class func{
	public void paintBackgroundSelectedAndPressed(Graphics2D g){
    path = decodePath8();
    g.setPaint(decodeGradient13(path));
    g.fill(path);
    path = decodePath9();
    g.setPaint(decodeGradient14(path));
    g.fill(path);
}
}
