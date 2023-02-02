//50
public class func{
	public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      g2.setColor(this.getColorForString(ob.getStringValForAttribute(BlocksWorld.ATTCOLOR)));
      float ry = cHeight - blockHeight - this.getHeight(s, ob)*blockHeight;
      g2.fill(new Rectangle2D.Float(rx + (hGap), ry, blockWidth - 2*hGap, blockHeight));
      g2.setColor(Color.black);
}
}
