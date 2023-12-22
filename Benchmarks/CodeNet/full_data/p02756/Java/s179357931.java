import java.util.*;
import java.io.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {

		try ( BufferedReader br = new BufferedReader( new InputStreamReader ( System.in) ) ) {

			 String S0 = br.readLine() ;
			 StringBuilder S = new StringBuilder(S0) ;


			 S0 = br.readLine() ;
			 int Q = Integer.valueOf( S0 ) ; 

			 boolean reversed = false ;
			 for ( int j=0  ;j<Q ; j++ ) {
				 S0 = br.readLine().trim() ;

				 if ( S0.length() == 1 ) {
					 reversed = ! reversed ;
				 } else {
					 String[] arr  = S0.trim().split(" ") ;
					 if ( Integer.valueOf( arr[1] ) ==1 )  {
						 if ( ! reversed ) {
							S.insert( 0 , arr[2] ) ;	
						 } else {
							S.append( arr[2] ) ;
						 }

					 } else {
						 if ( ! reversed ) {
							S.append( arr[2] ) ;
						 } else {
							S.insert( 0 , arr[2] ) ;	
						 }
					 }
				 }
			 }
			 if ( reversed )
				 S.reverse() ;
			 System.out.println( S ) ;
		} catch ( IOException e ){
			e.printStackTrace() ;
		}
	 }
}
