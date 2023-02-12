public class func{
public void main(String[] args){
        if (img.getRGB(60, 20) != Color.BLACK.getRGB()) {
            throw new RuntimeException("Error. Invalid pixel at (60,20)");
        }
        img = createCustomImage();
        g2d = img.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,IMG_WIDTH,IMG_HEIGHT);
        g2d.setColor(Color.WHITE);
        g2d.fill(oddShape);
}
}
