public class func{
public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      g2.fill(new Rectangle2D.Double(x, y, size, size));
      if (x + size > FrostbiteDomain.gameWidth)
        g2.fill(new Rectangle2D.Double(x - FrostbiteDomain.gameWidth, y, size, size));
      else if (x < 0)
        g2.fill(new Rectangle2D.Double(x + FrostbiteDomain.gameWidth, y, size, size));
}
}
