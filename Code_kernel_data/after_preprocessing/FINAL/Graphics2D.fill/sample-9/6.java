public class func{
public void drawLight2D(Graphics2D g,LightBotWorldCell cell){
    g.setColor(cell.isLightOn()?LIGHT_ON_COLOR:LIGHT_OFF_COLOR);
    g.fill(new Arc2D.Double(dx + 0.1 * CELL_WIDTH - dz, dy + 0.1 * CELL_WIDTH - dz, 0.8 * CELL_WIDTH,
        0.8 * CELL_WIDTH, 0, 360, Arc2D.OPEN));
}
}
