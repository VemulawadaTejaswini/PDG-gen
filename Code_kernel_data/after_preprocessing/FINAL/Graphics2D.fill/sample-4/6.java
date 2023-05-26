public class func{
public void makeRoundedCorner(final BufferedImage image,final int cornerRadius){
    g2.fill(new RoundRectangle2D.Float(0, 0, w, h, cornerRadius,
        cornerRadius));
    g2.setComposite(AlphaComposite.SrcAtop);
    g2.drawImage(image, 0, 0, null);
    g2.dispose();
}
}
