//10
public class func{
public void paintImage(Graphics2D g2d,Color color1,Color color2,Color color3){
        Color bcolor = new Color(1f, 1f, 1f, 0f);
        g2d.setBackground(bcolor);
        g2d.setColor(color1);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
        g2d.setColor(color2);
        g2d.translate(0, 128);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
        g2d.setColor(color3);
        g2d.translate(0, 128);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
}
}
