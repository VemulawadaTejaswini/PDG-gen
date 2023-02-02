//56
public class func{
public void drawPaint(double x,double y){
    Graphics2D gg = (Graphics2D) imgg.create();
    gg.translate(x, y);
    gg.setPaint(paint);
    gg.fill(brush);
    gg.dispose();
}
}
