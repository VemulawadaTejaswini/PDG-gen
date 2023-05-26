//8
public class func{
public void draw(final Graphics2D g2,final Rectangle2D bounds){
    final Graphics2D graphics2D = (Graphics2D) g2.create();
    graphics2D.clip( bounds );
    graphics2D.setColor( background );
    graphics2D.fill( bounds );
    graphics2D.setFont( font );
    graphics2D.setColor( foreground );
}
}
