//9
public class func{
public void testRect(Graphics2D g2d){
        g2d.fillRect(MinX, MinY, MaxX - MinX, MaxY - MinY);
        g2d.fill(new Rectangle(MinX, MinY, MaxX - MinX, MaxY - MinY));
}
}
