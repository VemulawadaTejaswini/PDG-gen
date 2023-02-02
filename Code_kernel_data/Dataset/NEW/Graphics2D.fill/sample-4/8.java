//8
public class func{
public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      if(ob.getIntValForAttribute(BlockDude.ATTDIR) == 1){
        ex = (rx+width) - eyeWidth;
      }
      g2.fill(new Rectangle2D.Float(ex, ey, eyeWidth, eyeHeight));
}
}
