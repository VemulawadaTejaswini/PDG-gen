import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 String S = sc.nextLine() ;

		 int N = Integer.valueOf( S ) ;
		 S = sc.nextLine() ;

		 Map<Character,TreeSet<Integer>> map = new HashMap<>() ;
		 char[] arr = new char[N] ;
		 for ( int j=0 ; j<S.length() ; j++ )  {
			 char c = S.charAt(j) ;
			 arr[j] = c  ;
			if ( ! map.containsKey( c ) )
				map.put( c , new TreeSet<>() );
			map.get(c).add ( j ) ;
		 }

		 S = sc.nextLine() ;
		 int Q = Integer.valueOf( S ) ;
		 for ( int j=0 ; j<Q ; j++ ) {
			 String[] query = sc.nextLine().split(" ") ;
			 int cmd = Integer.valueOf( query[0] ) ;
			 if ( cmd == 1 ) {
				 int  p1  = Integer.valueOf( query[1] )  -1 ;
				 char c1  = query[2].charAt(0) ;
				 
				 map.get( arr[p1] ).remove( p1 ) ; 
				 arr[p1] = c1 ;
				if ( ! map.containsKey( c1 ) )
					map.put( c1 , new TreeSet<>() );
				 map.get( c1 ).add ( p1 ) ; 

			 } else {
				 int p1 = Integer.valueOf( query[1] ) -1 ;
				 int p2 = Integer.valueOf( query[2] ) -1 ;
				 int cc = 0 ;
				 for ( Character x : map.keySet() ) {
					SortedSet<Integer> s1 = map.get(x).subSet( p1 , p2 +1 )  ;
					if ( s1.size() >= 1 )
						cc ++ ;
				 }
				System.out.println( cc ) ;
			 }


		 }


	 }
}