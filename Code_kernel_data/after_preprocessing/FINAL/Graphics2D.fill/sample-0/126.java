public class func{
public void paintTile(Graphics2D g,MapView mv,IVertexRenderer vertexRenderer){
    BlockingDeque<EleVertex> list = getVertices();
    for (EleVertex eleVertex : list) {
      Point p0 = mv.getPoint(eleVertex.get(0));
      Point p1 = mv.getPoint(eleVertex.get(1));
      Point p2 = mv.getPoint(eleVertex.get(2));
      Triangle shape = new Triangle(p0, p1, p2);
      g.setColor(vertexRenderer.getElevationColor(eleVertex));
      g.fill(shape);
    }
}
}
