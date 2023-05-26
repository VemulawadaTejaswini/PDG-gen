//5
public class func{
public void paintIcon(java.awt.Component c,java.awt.Graphics gr,int x,int y){
        Color color = (Color) editor.getDefaultAttribute(key);
        if (color != null) {
            g.setColor(color);
            g.translate(x, y);
            g.fill(colorShape);
            g.translate(-x, -y);
        }
}
}
