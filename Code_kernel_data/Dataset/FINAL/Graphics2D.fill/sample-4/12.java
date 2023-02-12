public class func{
public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      float ry = cHeight - height - ob.getIntValForAttribute(GridWorldDomain.ATTY)*height;
      g2.fill(new Rectangle2D.Float(rx, ry, width, height));
}
}
