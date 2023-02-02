//107
public class func{
public void renderBoxBorderAndBackground(final RenderBox box){
    if ( box.getBoxDefinition().getBorder().isEmpty() == false ) {
      borderRenderer.paintBackgroundAndBorder( box, g2 );
    } else {
      final Color backgroundColor = (Color) box.getStyleSheet().getStyleProperty( ElementStyleKeys.BACKGROUND_COLOR );
      if ( backgroundColor != null ) {
        final double x = StrictGeomUtility.toExternalValue( box.getX() );
        final double y = StrictGeomUtility.toExternalValue( box.getY() );
        final double w = StrictGeomUtility.toExternalValue( box.getWidth() );
        final double h = StrictGeomUtility.toExternalValue( box.getHeight() );
        boxArea.setFrame( x, y, w, h );
        g2.setColor( backgroundColor );
        g2.fill( boxArea );
      }
    }
}
}
