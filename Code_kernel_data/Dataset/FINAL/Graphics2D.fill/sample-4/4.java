public class func{
public void fillWithWhiteBackground(final BufferedImage resizedImage){
        g2d.fill(new Rectangle2D.Float(0, 0, resizedImage.getWidth(), resizedImage.getHeight()));
        g2d.dispose();
}
}
