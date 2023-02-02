//6
public class func{
public void paintComponent(Graphics g){
    g2.fill(new Rectangle2D.Double(0., 0., (double) tw.getWidth()*LightBotWorldView2D.CELL_WIDTH, (double) tw.getHeight()*LightBotWorldView2D.CELL_WIDTH));
    drawWorld2D(g2);
}
}
