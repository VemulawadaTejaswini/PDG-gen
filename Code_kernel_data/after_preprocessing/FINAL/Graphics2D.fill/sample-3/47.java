public class func{
public void paintComponent(Graphics graphics){
            Shape rect = new RoundRectangle2D.Double(
                    lineWidth/2d + getInsets().left,
                    lineWidth/2d + getInsets().top,
                    getWidth() - lineWidth/2d - getInsets().left - getInsets().right,
                    getHeight() - lineWidth/2d - getInsets().top - getInsets().bottom,
                    20, 20);
            g.fill(rect);
}
}
