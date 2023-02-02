//148
public class func{
public void paintImage(Graphics2D g2d,Color color){
        Dimension dimension = getDimension();
        g2d.scale(dimension.getHeight() / 128, dimension.getHeight() / 128);
        draw(path, g2d);
        g2d.setColor(color);
        g2d.fill(path);
}
}
