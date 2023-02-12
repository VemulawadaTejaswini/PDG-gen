public class func{
public void drawBaggle(Graphics2D g,BuggleWorldCell cell){
      g.fill(new Arc2D.Double(padx+ox+pad, pady+oy+pad, d, d, 0, 360, Arc2D.CHORD));
      g.setColor(getCellColor(cell.getX(), cell.getY()));
      g.fill(new Arc2D.Double(padx+ox+pad2, pady+oy+pad2, d2, d2, 0, 360, Arc2D.CHORD));
}
}
