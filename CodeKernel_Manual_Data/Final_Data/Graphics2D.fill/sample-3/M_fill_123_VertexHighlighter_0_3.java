public class A{
	public void paint( Graphics g ){
		Graphics2D graphics = (Graphics2D) g;
		
		for ( Vertex vertex : (Set<Vertex>) layout.getGraph().getVertices() ){
			State state = getState( vertex );
			
			Color color = colors.get( state.getName() );
			
			if ( color != null ){
				Coordinates coords = layout.getCoordinates( vertex );
				Dimension size = layout.getVertexFunctions().getShapeDimension( vertex );
				
				double hWidth = size.width + 6;
				double hHeight = size.height + 6;
				
				Shape highlight = new RoundRectangle2D.Double( coords.getX() - ( hWidth/2 ) , coords.getY() - ( hHeight/2 ), hWidth, hHeight, 10, 10 );
				
				Paint oldPaint = graphics.getPaint();
				
				graphics.setPaint( color );
				
				graphics.fill( highlight );
				
				graphics.setPaint( oldPaint );
			}
		}
	}
}