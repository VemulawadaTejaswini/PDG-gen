import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);

		 String[] arr = sc.nextLine().split(" ") ;

		 int H = Integer.valueOf ( arr[0]  ) ;
		 int N = Integer.valueOf ( arr[1]  ) ;
			
		 List<List<Integer>> list = new ArrayList<>() ;
		 for ( int i=0 ; i<N ; i++ ) {
			  arr = sc.nextLine().split(" ") ;
			 int a = Integer.valueOf ( arr[0]  ) ;
			 int b = Integer.valueOf ( arr[1]  ) ;
			 list.add ( Arrays.asList ( a, b ) ) ;
		 }

		 long[] arr0 = new long[H+1] ; 
		 for ( int x=1 ; x<=H ; x++ ) {
			 long v0 = -1 ; 
			 for ( List<Integer> ll : list ) {
				 long v =  -1 ; 
				if ( x - ll.get(0).intValue() <= 0 ) {
					v = ll.get(1).intValue() ;
				} else {
					v = ll.get(1).intValue() + arr0[ x - ll.get(0).intValue() ] ;
				}

				 if ( v0 == -1 ) {
					 v0 = v ;
				 } else {

					v0 = Math.min ( v0 , v ) ;
				 }
			 }
			 arr0[x] = v0 ;
		 }
		 System.out.println( arr0[H] ) ;
	 }
}