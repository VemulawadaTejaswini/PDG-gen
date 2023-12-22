import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 int K = Integer.valueOf(  sc.nextLine() ) ;

		List<Long> list00 = new ArrayList<>();
		 Deque<Long> queue = new ArrayDeque<>() ;
		 for ( int j=1 ; j<10 ; j++ ) {
			 list00.add ( (long)j ) ;
			 queue.add ( (long)j  ) ; 
		 }

		 while ( list00.size() < K ) {
			Deque<Long> queue2 = new ArrayDeque<>() ;
			for ( Long v : queue ) {
				Long x = v  % 10 ;
					
				Long v2 ;
				if ( x > 0 ) {
					v2 = v * 10 + ( x -1 ) ;
					queue2.add ( v2 ) ;
					list00.add ( v2 ) ; 
					if ( list00.size() >= K ) break ;
				}

				v2 = v * 10 + x ;
				queue2.add ( v2 ) ;
				list00.add ( v2 ) ; 
				if ( list00.size() >= K ) break ;
					
				if ( x < 9 ) {
					v2 = v * 10 + x + 1 ;
					queue2.add ( v2 ) ;
					list00.add ( v2 ) ; 
					if ( list00.size() >= K ) break ;
				}
			}
			if ( list00.size() >= K ) break ;
			queue = queue2 ;
		 }
			
		Collections.sort( list00 ) ;	
		System.out.println( list00.get( K -1 ) ) ;
	 }
}