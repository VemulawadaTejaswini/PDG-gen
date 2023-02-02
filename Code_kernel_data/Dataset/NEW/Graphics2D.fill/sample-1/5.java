//5
public class func{
public void draw(Graphics2D g2,Rectangle2D area){
        if (t > 0.0) {
            rect.setRect(x, y, w, t);
            g2.fill(rect);
        }
        if (b > 0.0) {
            rect.setRect(x, y + h - b, w, b);
            g2.fill(rect);
        }
        if (l > 0.0) {
            rect.setRect(x, y, l, h);
            g2.fill(rect);
        }
        if (r > 0.0) {
            rect.setRect(x + w - r, y, r, h);
            g2.fill(rect);
        }
}
}
