import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 String S0 = sc.nextLine() ;

		 LinkedList<String> list = new LinkedList<>() ; 
		 list.add( S0 ) ;

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
						list.add ( 0 , arr[2]  ) ;
					 } else {
						list.add( arr[2]  ) ;
					 }

				 } else {
					 if ( ! reversed ) {
						list.add( arr[2]  ) ;
					 } else {
						list.add ( 0 , arr[2]  ) ;
					 }
				 }
			 }
		 }

		 if ( ! reversed ) {
			 int start = 0 ; 
			 int end = list.size() -1 ; 
			 for ( int i=start; i<=end ; i++ )
				 System.out.print( list.get(i) ) ; 
		 } else {
			 int start = list.size()-1 ; 
			 int end = 0 ;
			 for ( int i=start; i>=end ; i-- )
				 System.out.print( list.get(i) ) ; 
		 }
			 System.out.println() ;

		 

	 }
}