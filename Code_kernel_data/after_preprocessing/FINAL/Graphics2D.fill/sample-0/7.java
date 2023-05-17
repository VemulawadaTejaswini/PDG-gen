public class func{
public void paintComponent(Graphics graphics){
    g.setColor(FILL_COLOR);
    g.fill(drawRect);
    g.setColor(DRAW_COLOR);
    g.draw(drawRect);
    g.dispose();    
}
}
