public class func{
public void closePath(Graphics2D g,Path2D.Double path,double previousX,Rectangle2D bounds,double yTopMargin){
      double yBottomOfArea = bounds.getY() + bounds.getHeight() - yTopMargin;
      path.lineTo(previousX, yBottomOfArea);
      path.closePath();
      g.fill(path);
}
}
