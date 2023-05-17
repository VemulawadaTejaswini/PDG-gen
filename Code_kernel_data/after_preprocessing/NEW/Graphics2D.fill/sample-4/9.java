//9
public class func{
public void replay(final int imageX,final int imageY){
    graphics.fill( new Rectangle( 0, 0, imageX, imageY ) );
    draw( graphics, new Rectangle2D.Float( 0, 0, imageX, imageY ) );
    graphics.dispose();
}
}
