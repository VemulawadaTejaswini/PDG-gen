import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);

		 String[] ss = sc.nextLine().split(" ") ; ;
		 int X = Integer.valueOf( ss[0] ) ;
		 int Y = Integer.valueOf( ss[1] ) ;
		 int A = Integer.valueOf( ss[2] ) ;
		 int B = Integer.valueOf( ss[3] ) ;
		 int C = Integer.valueOf( ss[0] ) ;

		
		 ss = sc.nextLine().split(" ") ; ;
		 List<Long> red  = new ArrayList<>() ;
		 for ( String s1 : ss )
			 red.add ( Long.valueOf( s1 ) ) ;

		 ss = sc.nextLine().split(" ") ; ;
		 List<Long> green = new ArrayList<>() ;
		 for ( String s1 : ss )
			 green.add ( Long.valueOf( s1 ) ) ;

		 ss = sc.nextLine().split(" ") ; ;
		 List<Long> white = new ArrayList<>() ;
		 for ( String s1 : ss )
			 white.add ( Long.valueOf( s1 ) ) ;
		Collections.sort( red ) ;
		Collections.sort( green ) ;
		Collections.sort( white ) ;
		Collections.reverse( red ) ;
		Collections.reverse( green ) ;
		Collections.reverse( white ) ;
		
		long total = 0 ;
		int idxw = 0 ;
		for ( int j=0  ; j<X ; j++ )  {
			long v0 = red.get(j).longValue() ; 
			long v1 = white.get(idxw).longValue() ;
			if ( v0 > v1 ) {
				total += v0 ;
			} else {
				total += v1 ; 
				idxw++ ;
			}
		 }

		for ( int j=0  ; j<Y ; j++ )  {
			long v0 = green.get(j).longValue() ; 
			long v1 = white.get(idxw).longValue() ;
			if ( v0 > v1 ) {
				total += v0 ;
			} else {
				total += v1 ; 
				idxw++ ;
			}
		 }
		System.out.println( total ) ;

	 }
}