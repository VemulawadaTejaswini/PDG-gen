import java.util.*;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		if(N > 1L && M > 1L){
			System.out.println( (N  - 2L) * (M - 2L) );
		}
		if( N == 1L && M > 1L){
			System.out.println( M - 2L );
		}
		if( N > 1L && M == 1L){
			System.out.println( N - 2L );
		}
		if( N == 1L && M == 1L){
			System.out.println(1);
		}
	}
}
