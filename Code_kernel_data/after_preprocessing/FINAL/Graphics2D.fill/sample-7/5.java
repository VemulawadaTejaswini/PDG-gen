public class func{
public void drawSlot(Graphics2D g2,int rank,double xoffset){
    if (board.values(rank)==null)
      return;
    for (int i=0; i<board.values(rank).length; i++) {
      int size = board.values(rank)[i];
      g2.setColor(board.getColor(rank, i));
      g2.fill(new Rectangle2D.Double( xoffset-size*5-3, 180-(11.*height),  size*10+3, 10));
      if (rank == pegFrom && i==board.values(rank).length-1) {
        g2.setStroke(new BasicStroke(3));
        g2.setColor(buggyMove ? Color.red : Color.green);
      } else {
        g2.setColor(Color.black);
      }
      g2.draw(new Rectangle2D.Double( xoffset-size*5-3, 180-(11.*height),  size*10+3, 10));
      height++;
    }
}
}
