public class func{
public void paintIcon(Component c,Graphics g,int x,int y){
            new Ellipse2D.Double(x + getIconWidth() - JBUI.scale(iSize), y + getIconHeight() - iSize, iSize, iSize);
          g2d.fill(shape);
}
}
