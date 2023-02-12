public class func{
public void paintGradient(Graphics2D g2d,Color gradientStartColor,Color gradientEndColor,int length,boolean vertical){
            if(vertical) g2d.setPaint(new GradientPaint(0, 0, gradientStartColor, 0, length, gradientEndColor));
            else g2d.setPaint(new GradientPaint(0, 0, gradientStartColor, length, 0, gradientEndColor));
            g2d.fill(g2d.getClip());
            g2d.setPaint(oldPainter);
}
}
