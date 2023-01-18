//44
public class func{
	public void fillLiteShape(Graphics2D g,LiteShape2 shape){
        if(shape.getGeometry() instanceof MultiPolygon && shape.getGeometry().getNumGeometries() > 1) {
            MultiPolygon mp = (MultiPolygon) shape.getGeometry();
            for (int i = 0; i < mp.getNumGeometries(); i++) {
                Polygon p = (Polygon) mp.getGeometryN(i);
                try {
                    g.fill(new LiteShape2(p, null, null, false, false));
                } catch(Exception e) {
                    // should not really happen, but anyways
                    throw new RuntimeException("Unexpected error occurred while rendering a multipolygon", e);
                }
            }
        } else {
            g.fill(shape);
        }
}
}
