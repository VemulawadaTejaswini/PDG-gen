//6
public class func{
public void addBackground(BufferedImage baseImage){
    GradientPaint paint = new GradientPaint(0, 0, colorFrom, width, height,
        colorTo);
    graph.setPaint(paint);
    graph.fill(new Rectangle2D.Double(0, 0, width, height));
    graph.drawImage(baseImage, 0, 0, null);
}
}
