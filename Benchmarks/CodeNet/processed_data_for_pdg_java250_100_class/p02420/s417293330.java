public class Main {
    public static void main( String args[] ) {
        Scanner scan	= new Scanner( System.in );
		while( true ) {
			String	n		= scan.next();
			if ( n.equals("-") ) {
				break;
			}
			int	m = scan.nextInt();
			for( int i = 0; i < m; i++ ) {
				int h = scan.nextInt();
				n = n.substring( h, n.length() ) + n.substring( 0, h );
			}
			System.out.println( n );
		}
		scan.close();
	}
}
