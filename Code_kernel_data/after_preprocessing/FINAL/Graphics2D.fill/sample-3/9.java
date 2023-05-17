public class func{
public void paint(Graphics2D g,double xOffset,double yOffset,int markerSize){
    double halfSize = (double) markerSize / 2;
    Shape circle = new Ellipse2D.Double(xOffset - halfSize, yOffset - halfSize, markerSize, markerSize);
    g.fill(circle);
}
}
