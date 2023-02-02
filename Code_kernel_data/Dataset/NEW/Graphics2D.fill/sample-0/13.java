//13
public class func{
public void paintIcon(Component c,Graphics g,int x,int y){
            Graphics2D graphics = (Graphics2D)g;
            graphics.setColor(SwingTools.LIGHT_BLUE);
            graphics.fill(arrowShape);
            graphics.setColor(SwingTools.DARK_BLUE);
            graphics.draw(arrowShape);
            g.translate(-x, -y);
}
}
