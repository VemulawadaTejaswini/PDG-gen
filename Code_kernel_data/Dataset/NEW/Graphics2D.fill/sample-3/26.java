//26
public class func{
public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      double xr = (lld.getXmax() - lld.getXmin());
      double yr = (lld.getYmax() - lld.getYmin());
      double nl = (ol - lld.getXmin()) / xr;
      double nt = (ot - lld.getYmin()) / yr;
      g2.fill(new Rectangle2D.Double(sx, sy, sw, sh));
}
}
