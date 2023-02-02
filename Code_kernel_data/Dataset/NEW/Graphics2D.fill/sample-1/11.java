//11
public class func{
public void createTriangles(Color c){
        g2.fill(new Polygon(new int[] {0, a/2, a}, new int[] {0, b/2, 0}, 3));
        g2.fill(new Polygon(new int[] {0, a/2, 0}, new int[] {b/2, b/2, b}, 3));
        g2.fill(new Polygon(new int[] {a, a/2, a}, new int[] {b/2, b/2, b}, 3));
        return new TexturePaint(bi, new Rectangle(0, 0, a, b));
}
}
