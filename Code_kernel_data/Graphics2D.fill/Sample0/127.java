//126
public class func{
	public void paintTile(Graphics2D g,MapView mv,IVertexRenderer vertexRenderer){
    BlockingDeque<EleVertex> list = getVertices();
    for (EleVertex eleVertex : list) {
      Point p0 = mv.getPoint(eleVertex.get(0));
      Point p1 = mv.getPoint(eleVertex.get(1));
      Point p2 = mv.getPoint(eleVertex.get(2));
      Triangle shape = new Triangle(p0, p1, p2);

      // obtain vertex color
      g.setColor(vertexRenderer.getElevationColor(eleVertex));
      // TODO: Move to renderer
      g.fill(shape);
    }
}
}
