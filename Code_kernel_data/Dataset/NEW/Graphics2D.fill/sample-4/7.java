//7
public class func{
public void applyRoundedCorners(BufferedImage image,int cornerRadius){
    g2.fill(new RoundRectangle2D.Float(0, 0, w, h, cornerRadius, cornerRadius));
    g2.setComposite(AlphaComposite.SrcIn);
    g2.drawImage(image, 0, 0, null);
    g2.dispose();
}
}
