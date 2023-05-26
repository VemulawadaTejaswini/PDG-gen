//82
public class func{
public void draw(final Graphics2D graphics,final Rectangle2D area){
      g2.setPaint( Color.white );
      g2.fill( area );
    g2.translate( -area.getX(), -area.getY() );
        StrictGeomUtility.createBounds( area.getX(), area.getY(), area.getWidth(), area.getHeight() );
}
}
