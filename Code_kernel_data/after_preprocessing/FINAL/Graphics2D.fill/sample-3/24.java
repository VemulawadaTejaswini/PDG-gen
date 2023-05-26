public class func{
public void drawLight2D(Graphics2D g,GridWorldCell cell,boolean lightOn){
    g.fill(new Arc2D.Double(cell.getX()*LightBotWorldView2D.CELL_WIDTH + 0.1*LightBotWorldView2D.CELL_WIDTH, cell.getY()*LightBotWorldView2D.CELL_WIDTH + 0.1*LightBotWorldView2D.CELL_WIDTH, 0.8*LightBotWorldView2D.CELL_WIDTH, 0.8*LightBotWorldView2D.CELL_WIDTH, 0, 360, Arc2D.OPEN));
}
}
