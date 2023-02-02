//20
public class func{
public void drawSelected(Graphics2D graphics,ButtonModel model){
            float offset = (getIconWidth() - DOT_DIAMETER) / 2.0f;
            Ellipse2D dot = new Ellipse2D.Float(offset, offset, DOT_DIAMETER, DOT_DIAMETER);
            graphics.fill(dot);
}
}
