//156
public class func{
public void renderArrow(StyleGroup group,Graphics2D g,Camera camera,GraphicEdge edge){
        shape.reset();
        shape.moveTo(x, y);
        shape.lineTo(x - theDirection.data[0] - perp.data[0], y
            - theDirection.data[1] - perp.data[1]);
        shape.closePath();
        g.fill(shape);
}
}
