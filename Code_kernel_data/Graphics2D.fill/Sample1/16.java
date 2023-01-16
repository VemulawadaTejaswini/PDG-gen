//15
public class func{
	public void paintImage(Graphics2D g2d,Color color1,Color color2,Color color3){
        Dimension dimension = getDimension();
        g2d.scale(dimension.getWidth() / 128, dimension.getWidth() / 128);
        draw(path, g2d);
        g2d.setColor(color1);
        g2d.fill(path);
        g2d.setColor(color2);
        g2d.translate(0, 128);
        g2d.fill(path);
        g2d.setColor(color3);
        g2d.translate(0, 128);
        g2d.fill(path);
}
}
