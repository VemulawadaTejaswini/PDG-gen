//85
public class func{
public void print(Graphics2D g2,double scalex,double scaley,int xOffset,int yOffset,int imgHeight){
      for (int i = 0; i < spotcnt; i++)
        g2.fill(new Rectangle2D.Double(spots[i].x * scalex - 1 + xOffset, spots[i].y * scalex - 1 + yOffset, 3, 3));
      g2.setColor(Color.black);
}
}
