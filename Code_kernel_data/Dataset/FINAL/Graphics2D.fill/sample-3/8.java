public class func{
public void drawBuggle(Graphics2D g,AbstractBuggle b){
          int direction = b.getDirection().intValue();
          if (INVADER_SPRITE[direction][dy][dx] == 1) {
            g.fill(new Rectangle2D.Double(padx+pad+ox+dx*pixW, pady+pad+oy+dy*pixW, pixW, pixW));
          }
}
}
