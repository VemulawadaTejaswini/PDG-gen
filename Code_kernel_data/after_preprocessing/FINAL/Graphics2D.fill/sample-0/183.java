public class func{
public void exportImage(BufferedImage bufferedImage,Rectangle rectangle,RenderingHints hints,boolean transparent){
            graphics.setColor(Color.white);
            graphics.fill(rectangle);
        _drawPlot(graphics, false, rectangle);
}
}
