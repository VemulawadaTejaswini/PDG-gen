public class func{
public void paintComponent(Graphics g){
            g2d.setColor(mouseOverColor);
            g2d.setColor(normalColor);            
         g2d.fill(roundedRectangle);
         g2d.setColor(Color.white);
         g2d.draw(roundedRectangle);
         roundedRectangle = new RoundRectangle2D.Float(1, 1, getActualWidth()-3, getActualHeight()-3, 10, 10);
}
}
