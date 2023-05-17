//17
public class func{
public void createShapeImage(Shape shape,Color c1,Color c2){
    BufferedImage image = GraphicsUtils.createImage(rect.width,
        rect.height, true);
    Graphics2D g = image.createGraphics();
    g.setColor(c1);
    g.fill(shape);
    g.setColor(c2);
    g.draw(shape);
}
}
