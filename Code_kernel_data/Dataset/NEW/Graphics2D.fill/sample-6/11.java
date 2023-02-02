//11
public class func{
public void getBiWithAxes(){
        Rectangle backRect = new Rectangle(0, 0, this.image.getWidth() + 40, this.image.getHeight() + 40);
        graphicAxis.fill(backRect);
        graphicAxis.draw(backRect);
        graphicAxis.drawImage(this.image, 35, 5, null);
        graphicAxis.setColor(Color.BLACK);
}
}
