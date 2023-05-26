//9
public class func{
public void draw(Graphics2D g2d,AlphaComposite composite,String name){
        GeneralPath src = new GeneralPath();
        src.moveTo(0, 0);
        src.lineTo(0, 100);
        src.closePath();
        g2d.fill(src);
        g2d.setComposite(AlphaComposite.Src);
        g2d.setColor(Color.white);
        g2d.fillRect(40, 90, 60, 10);
        g2d.setColor(Color.black);
        g2d.drawString(name, 45, 100);
}
}
