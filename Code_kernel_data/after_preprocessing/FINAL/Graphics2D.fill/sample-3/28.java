public class func{
public void drawFill(Graphics2D g){
        new Ellipse2D.Double(ellipse.getCenterX()-POINT_SIZE, 
                  ellipse.getCenterY()-POINT_SIZE, 
                  POINT_SIZE*2, POINT_SIZE*2);
    g.fill(newEllipse);
    drawText(g);
}
}
