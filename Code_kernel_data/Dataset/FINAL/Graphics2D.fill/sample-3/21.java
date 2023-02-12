public class func{
public void drawBot2D(Graphics2D g,LightBotEntity bot){
    g.fill(new Arc2D.Double((cx - 0.25) * CELL_WIDTH - cell.getHeight() * CELL_HEIGHT, (cy + 0.1) * CELL_WIDTH
        - cell.getHeight() * CELL_HEIGHT, 1.5 * width, 1.5 * height, 60, 60, Arc2D.PIE));
    g.rotate(-angle, rx, ry);
}
}
