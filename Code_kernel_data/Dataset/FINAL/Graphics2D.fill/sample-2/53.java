public class func{
public void paintBar(Graphics2D g,JComponent c,int width,int height){
        if (testValid(x, y, width, height)) {
            Shape s = shapeGenerator.createRectangle(x, y, width, height);
            g.setPaint(getProgressBarPaint(s));
            g.fill(s);
            
            g.setPaint(getProgressBarBorderPaint());
            g.draw(s);
        }
}
}
