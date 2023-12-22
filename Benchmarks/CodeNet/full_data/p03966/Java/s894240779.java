import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] T = new long[N];
		long[] A = new long[N];
		for( int i=0; i<N; i++ ){
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		for( int i=1; i<N; i++ ){
			int a = 0;
			while( a==0 ){
				long vote1 = Math.max( T[i-1],A[i-1] );
				long vote2 = Math.min( T[i],A[i] );
				if( vote2>=vote1 ){
					a = 1;
				}else{
					T[i]+=T[i];
					A[i]+=A[i];
				}
			}
		}
		System.out.println(T[N-1]+A[N-1]);
	}
}
