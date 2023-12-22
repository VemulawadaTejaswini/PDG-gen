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
		 Map<Integer,Long> map = new HashMap<>() ;
		 for ( int j=0 ; j<s1.length()  ;j++ ) {
			 Map<Integer,Long> map2 = new HashMap<>() ;
			int v0 = Integer.valueOf( s1.substring(j,j+1) ) ;
			for ( int key : map2.keySet() ) {
				int v2 = ( key * 10 + v0  ) %  p ;
				map2.put(v2 ,  map.get(key).longValue()  + map2.getOrDefault( v2 , 0L ) ) ;
			}
			map2.put( 0 , map.getOrDefault( 0 , 0L ) + 1 ) ;
//			System.out.println( v0 +"," + Arrays.toString ( arr1 ) ) ;
			map = map2 ;
			if ( map.containsKey( 0 ) )
			x += map.get(0).longValue() ;
		 }
			System.out.println( x ) ;
		 

	 }
}