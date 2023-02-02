//128
public class func{
public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      float ry = cHeight - height - ob.getIntValForAttribute(BlockDude.ATTY)*height;
      g2.fill(new Rectangle2D.Float(rx, ry, width, height));
      g2.setColor(Color.orange);
}
}
