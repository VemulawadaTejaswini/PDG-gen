//50
public class func{
	public void paintBackground(Graphics g,JComponent component){
      final RoundRectangle2D rectangleRounded = new RoundRectangle2D.Double( 0, 0, getWidth(), getHeight() * 2, 8, 8 );
      g2D.fill( rectangleRounded );
      final RoundRectangle2D rectangleRounded = new RoundRectangle2D.Double( 0, 0, getWidth() * 2, getHeight(), 8, 8 );
      g2D.fill( rectangleRounded );
    g2D.dispose();
}
}
