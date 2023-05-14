public class A{
	public static void main(){
		Graphics2D graphics = (Graphics2D) g;
		Shape highlight = new RoundRectangle2D.Double( coords.getX() - ( hWidth/2 ) , coords.getY() - ( hHeight/2 ), hWidth, hHeight, 10, 10 );
		graphics.fill( highlight );
	}
}