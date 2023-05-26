public class func{
public void paintColorBlob(final Graphics2D g,final Color color){
            g.setColor(Color.white);
            g.fill(BlobShape);
            g.setColor(color);
            g.fill(BlobShape);
            g.setColor(Color.gray);
            g.draw(BlobShape);
}
}
