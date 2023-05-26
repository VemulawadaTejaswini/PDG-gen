public class func{
public void titledImagePanel(String string,RenderedImage expected){
        panel.add(
                new ScrollingImagePanel(expected, Math.min(400, expected.getWidth()), Math.min(400,
                        expected.getHeight())), BorderLayout.CENTER);
}
}
