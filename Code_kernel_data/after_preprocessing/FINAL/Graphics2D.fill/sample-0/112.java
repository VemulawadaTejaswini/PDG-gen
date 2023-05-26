public class func{
public void paint(final Graphics2D g,final Rectangle clip){
      g.setColor(java.awt.Color.BLACK);
      g.fill(pathLabels);
    if(vectorTrans!=null)
      endRotation(g, vectorTrans);
}
}
