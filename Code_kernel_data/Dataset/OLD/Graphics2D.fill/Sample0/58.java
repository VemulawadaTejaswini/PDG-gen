//57
public class func{
	public void paintBorder(Component c,Graphics g,int x,int y,int width,int height){
            Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
            corner.subtract(new Area(round));
            g2.fill(corner);
        g2.setColor(Color.lightGray);
        g2.draw(round);
        g2.dispose();
}
}
