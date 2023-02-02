//4
public class func{
public void drawBackground(Graphics2D g){
    BuggleWorld w = (BuggleWorld)world;
    if (w.getVisibleGrid() == false) {
      g.setColor(Color.white);
      g.fill(new Rectangle2D.Double(padx,pady ,(w.getWidth()-1)*cellW,(w.getHeight()-1)*cellW));        
    }
    for (int x=0; x<w.getWidth(); x++) {
      for (int y=0; y<w.getHeight(); y++) {
        g.setColor(getCellColor(x, y));
        
        BuggleWorldCell cell = (BuggleWorldCell) w.getCell(x, y);

        g.fill(new Rectangle2D.Double(padx+x*cellW, pady+y*cellW, cellW, cellW));  
        
        if (cell.hasBaggle())
          drawBaggle(g, cell);
        if (cell.hasContent())
          drawMessage(g, cell, cell.getContent());
      }
    }
    if (((BuggleWorld) world).getVisibleGrid()) {
}
}
