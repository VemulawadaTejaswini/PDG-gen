//3
public class func{
public void paintTexture(String textureFile,Shape shape){
        if (textureFile != null) {
            img = ResourcesManager.getResource(textureFile);

            if (img != null) {
                Rectangle2D replicationPath = new Rectangle2D.Double(0,
                        0,
                        img.getWidth(),
                        img.getHeight());
                TexturePaint texture = new TexturePaint(img, replicationPath);
                g2.setPaint(texture);
                g2.fill(shape);
            }
        }
}
}
