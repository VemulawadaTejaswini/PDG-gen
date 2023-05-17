public class func{
public void drawSomething(final BufferedImage image){
        Graphics2D g = image.createGraphics();
            int width = image.getWidth();
            int height = image.getHeight();
            g.clearRect(0, 0, width, height);
            g.setPaint(new LinearGradientPaint(0, 0, width, 0, new float[] {0.2f, 1}, new Color[] {new Color(0x0, true), Color.BLUE}));
            g.fillRect(0, 0, width, height);
            g.setPaint(new LinearGradientPaint(0, 0, 0, height, new float[] {0.2f, 1}, new Color[] {new Color(0x0, true), Color.RED}));
            g.fillRect(0, 0, width, height);
            g.setPaint(new LinearGradientPaint(0, 0, 0, height, new float[] {0, 1}, new Color[] {new Color(0x00ffffff, true), Color.WHITE}));
            g.fill(new Polygon(new int[] {0, width, width}, new int[] {0, height, 0}, 3));
            g.dispose();
}
}
