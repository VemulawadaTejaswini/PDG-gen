//2
public class func{
public void set(Shape shape){
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.draw(shape);
        g2d.fill(shape);
        g2d.dispose();
}
}
