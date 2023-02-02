//16
public class func{
public void drawBackground(Graphics2D graphics,Dimension dimension,int _startColor){
    Color endColor = getRandomColor(_startColor);
    GradientPaint gradientPaint = new GradientPaint(getRandomPointOnBorder(dimension), 
                      startColor,
                      getRandomPointOnBorder(dimension),  
                      endColor.brighter(), 
                      true);
    graphics.setPaint(gradientPaint);
    graphics.fill(new Rectangle(dimension));
}
}
