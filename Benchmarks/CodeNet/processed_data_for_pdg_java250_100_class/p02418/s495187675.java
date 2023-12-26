public class Main {
	public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            String ringStr = kb.readLine();    
            String targetStr = kb.readLine();  
            int ringStrLen = ringStr.length();     
            int targetStrLen = targetStr.length(); 
            int j = 0;
            for( int i = 0; i < ringStrLen; i++ ) {
                if( targetStr.charAt( 0 ) == ringStr.charAt( i ) ) {
                    int ij = i;
                    for( j = 0; j < targetStrLen; j++ ) {
                        ij = ( i+j ) % ringStrLen;
                        if( targetStr.charAt( j ) != ringStr.charAt( ij ) ) {
                            break;
                        }
                    }
                }
                if( targetStrLen == j ) { break; }
            }
            if( targetStrLen == j ) {
                System.out.println( "Yes" );            
            } else {
                System.out.println( "No" );
            }
        } catch( IOException e ) {
            System.err.println( e );
        }
	}
}
