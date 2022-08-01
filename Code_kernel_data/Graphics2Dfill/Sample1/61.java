//60
public class func{
	public void paintComponent(Graphics g){
      for (Point2D p: points) {
        r.setRect(p.getX(), p.getY(), 1, 1);
        g2.fill(r);
      }
}
}
