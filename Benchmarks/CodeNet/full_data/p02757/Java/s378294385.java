import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 String s1 = sc.nextLine() ;
		 String[] sp = s1.trim().split(" ") ; 
		int N = Integer.valueOf( sp[0] ) ;
		int p = Integer.valueOf( sp[1] ) ;
		 s1 = sc.nextLine() ;
		
		 long x = 0;
		 long[] arr = new long[p] ;
		 arr[0] = 0 ;
		 for ( int j=0 ; j<s1.length()  ;j++ ) {
			 long[] arr1 = new long[p] ;
			int v0 = Integer.valueOf( s1.substring(j,j+1) ) ;
			for ( int k=0 ; k<arr.length ; k++ ) {
				if ( arr[k] == 0 ) continue ; 
				int v2 = ( k * 10 + v0  ) %  p ;
				arr1[v2] += arr[k] ;
			}
			arr1[v0%p] += 1 ;
//			System.out.println( v0 +"," + Arrays.toString ( arr1 ) ) ;
			arr = arr1 ;
			x += arr[0]; 
		 }
			System.out.println( x ) ;
		 

	 }
}