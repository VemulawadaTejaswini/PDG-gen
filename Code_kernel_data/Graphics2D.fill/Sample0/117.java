//116
public class func{
	public void tintSquare(int[] coords,int square_width,AlphaComposite ac,Color color,BufferedImage bi,Graphics2D g2d){
    g2d.setComposite(ac);
    g2d.setColor(color);
    g2d.fill(rect);
    g2d.drawImage(bi, null, 0, 0);
}
}
