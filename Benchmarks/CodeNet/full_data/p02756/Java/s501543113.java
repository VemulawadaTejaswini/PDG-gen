import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 String S0 = sc.nextLine() ;
		 StringBuilder S = new StringBuilder(S0) ;

		 S0 = sc.nextLine() ;
		 int Q = Integer.valueOf( S0 ) ; 
		 boolean reversed = false ;
		 for ( int j=0  ;j<Q ; j++ ) {
			 String[] arr  = sc.nextLine().trim().split(" ") ;
			 if ( arr.length == 1 ) {
				 reversed = ! reversed ;
			 } else {
				 if ( arr[1].equals("1" ) ) {
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
		 

	 }
}