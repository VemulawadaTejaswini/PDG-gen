public class func{
public void paintBox(Graphics2D g,int width,int height){
        if (testValid(0, 0, width - 1, height)) {
            Shape s = shapeGenerator.createRectangle(0, 0, width - 1, height);
            g.setPaint(getScrollBarButtonBoxPaint(s));
            g.fill(s);
            g.setPaint(getScrollBarButtonBoxBorderColor());
            g.draw(s);
        }
}
}
