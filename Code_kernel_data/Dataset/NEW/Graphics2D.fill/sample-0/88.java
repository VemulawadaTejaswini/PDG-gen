//88
public class func{
public void paintComponent(final Graphics aGraphics){
        for ( int i = 0; i < this.barCount; i++ )
        {
          canvas.setColor( calculateBarColor( i ) );
          canvas.fill( rect );
          canvas.rotate( ( 2.0 * Math.PI ) / this.barCount );
        }
        canvas.fillRect( 0, 0, getWidth(), getHeight() );
      canvas.dispose();
}
}
