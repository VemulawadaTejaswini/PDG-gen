public class func{
public void roundCorners(BufferedImage sourceImage,int cornerRadius){
        g2.fill(new Ellipse2D.Float(0, 0, w , h));
        g2.setComposite(AlphaComposite.SrcAtop);
        g2.drawImage(sourceImage, 0, 0, null);
        g2.dispose();
}
}
