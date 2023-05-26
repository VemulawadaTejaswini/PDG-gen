//5
public class func{
public void paintOffscreen(Graphics2D g,Rectangle rect){
        g.setColor(Color.white);
        g.fill(rect);
        paintImpl(g, rect);
        Color c = g.getColor();
        g.setColor(Color.darkGray);
        g.drawRect(rect.x, rect.y, rect.width, rect.height);
        g.setColor(c);            //super.paintBorder(g);
}
}
