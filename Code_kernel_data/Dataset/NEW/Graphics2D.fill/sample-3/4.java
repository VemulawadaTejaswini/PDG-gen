//4
public class func{
public void paintComponent(Graphics g){
    g2.fill(new Rectangle2D.Double(0., 0., getWidth(), getHeight()));
    double ratio = Math.min(((double) getWidth()) / renderedX, ((double) getHeight()) / renderedY);
    g2.translate(Math.abs(getWidth() - ratio * renderedX)/2., Math.abs(getHeight() - ratio * renderedY)/2.);
    g2.scale(ratio, ratio);
}
}
