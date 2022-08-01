//78
public class func{
	public void renderElement(StyleGroup group,Graphics2D g,Camera camera,GraphicElement element){
    shape.setFrame(pos.x - w2, pos.y - h2, width, height);
    g.fill(shape);
    renderText(group, g, camera, element);
}
}
