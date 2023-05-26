public class func{
public void createRedOffImage(final int WIDTH,final int HEIGHT){
        final TexturePaint HATCH_PAINT = new TexturePaint(HATCH_TEXTURE, new java.awt.Rectangle(0, 0, 2, 2));
        G2.setPaint(HATCH_PAINT);
        G2.fill(INNER_SHADOW);
        G2.dispose();
}
}
