//52
public class func{
	public void drawVertexRectangles(Graphics2D g2d){
      g2d.fill(new Rectangle2D.Double(v0.x - vertexDrawSize / scale,
          v0.y - vertexDrawSize / scale, vertexDrawSize * 2 / scale,
          vertexDrawSize * 2 / scale));
      g2d.fill(new Rectangle2D.Double(v1.x - vertexDrawSize / scale,
          v1.y - vertexDrawSize / scale, vertexDrawSize * 2 / scale,
          vertexDrawSize * 2 / scale));
}
}
