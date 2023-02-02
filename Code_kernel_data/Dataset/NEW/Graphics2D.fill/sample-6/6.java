//6
public class func{
public void paintBorder(Component c,Graphics g,int x,int y,int width,int height){
        g2.setStroke( new BasicStroke( thickness ) );
        g2.setColor( outlineColor );
        g2.draw( path );
        g2.setColor( backgroundColor );
        g2.fill( path );
        g2.setStroke( prevStroke );
        g2.setPaint( prevPaint );
        g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING , prevAntialias );
}
}
