//135
public class func{
	public void getMask(){
    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
    Graphics2D g2d = bi.createGraphics();
    g2d.setColor(Color.white);
    g2d.fill(shape);
}
}
