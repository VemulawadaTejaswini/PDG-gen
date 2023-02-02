//10
public class func{
public void paint(Graphics2D g,double factor,int xOffset,int yOffset,boolean dotSelection,String control1,String control2,String control3){
    for (int i = 0; i < spotcnt; i++)
      g.fill(new Rectangle2D.Double(spots[i].x * factor - 1 + xOffset, spots[i].y * factor - 1 + yOffset, 3, 3));
}
}
