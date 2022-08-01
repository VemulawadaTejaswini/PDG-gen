//49
public class func{
	public void main(String[] args){
        BufferedImage img = new BufferedImage(IMG_WIDTH, IMG_HEIGHT,
                                              BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,IMG_WIDTH,IMG_HEIGHT);
        g2d.setColor(Color.WHITE);
        g2d.fill(oddShape);
}
}
