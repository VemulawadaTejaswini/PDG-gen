//143
public class func{
public void getBevelImage(int width,int height,Area s){
        g2.setColor(ShapeBevel.getFrontFaceOverlay(light));
        g2.fill(s);
        ShapeBevel.createShapeBevel(g2, s, 0.1, bevelSize, bevelSize, light);
        BevelCacheKey key2 = new BevelCacheKey(width, height, new Area(s));
        bevelCache.put(key2, img);
}
}
