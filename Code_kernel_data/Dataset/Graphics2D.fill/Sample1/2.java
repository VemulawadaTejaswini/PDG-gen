//1
public class func{
	public void paintComponent(Graphics graphics){
        r = new Rectangle(- 5, - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(w / 4 - 5, h / 4 - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(w / 4 - 5, - h / 4 - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(- w / 4 - 5, h / 4 - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(- w / 4 - 5, - h / 4 - 5, 10, 10);
        g.fill(r);
}
}
