public class func{
public void draw(Graphics2D graphics,IProgressMonitor monitor){
        graphics.setPaint(new Color(fillColor.getRed(), fillColor.getGreen(), fillColor.getBlue(),
                fillAlpha));
        graphics.fill(shape);
        BasicStroke stroke = new BasicStroke(lineWidth);
        graphics.setStroke(stroke);
}
}
