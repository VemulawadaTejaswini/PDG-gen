//44
public class func{
public void toRaster(Shape mask){
                if (bounds.width > 0 && bounds.height > 0) {
                    BufferedImage clip =
                        new BufferedImage(bounds.x + bounds.width,
                                          bounds.y + bounds.height,
                                          BufferedImage.TYPE_BYTE_BINARY);
                    Graphics2D g = clip.createGraphics();
                    g.setColor(Color.black);
                    g.fillRect(0, 0, bounds.x + bounds.width, bounds.y + bounds.height);
                    g.setColor(Color.white);
                    g.fill(mask);
                    raster = clip.getRaster();
                }
}
}
