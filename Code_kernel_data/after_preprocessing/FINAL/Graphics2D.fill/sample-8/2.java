public class func{
public void paintComponent(Graphics g){
            g2d.fill(new Rectangle(0, 0, getWidth(), getHeight()));
            g2d.setComposite(AlphaComposite.SrcOver);
}
}
