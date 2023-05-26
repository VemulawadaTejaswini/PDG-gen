//2
public class func{
public void paintComponent(Graphics graphics){
            g.setColor(new Color(255, 0, 0, 128));
            g.fill(inner);
            g.setColor(Color.red);
            g.draw(inner);
            g.setColor(oldColor);
            g.setStroke(oldStroke);
}
}
