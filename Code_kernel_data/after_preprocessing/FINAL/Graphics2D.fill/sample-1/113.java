public class func{
public void drawRect(Graphics2D g,int color,double w1,double h1,double w2,double h2,boolean useLatlon){
    double hmin = Math.min(h1, h2);
    double height = Math.abs(h1 - h2);
    rect.setRect(wmin, hmin, width, height);
    g.fill(rect);
}
}
