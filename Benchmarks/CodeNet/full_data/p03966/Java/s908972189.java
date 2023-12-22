import java.util.*;
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
			if( T[i]<T[i-1] || A[i]<A[i-1] ){
				long a = Math.max(T[i-1]/T[i],A[i-1]/A[i]);
				for( long j=a; j<(a+2; j++ ){
					T[i] *= j;
					A[i] *= j;
					if( T[i]>=T[i-1] && A[i]>=A[i-1] ){
						break;
					}
					T[i] = T[i]/j;
					A[i] = A[i]/j;       
				}              
			}         
		}   
		System.out.println(T[N-1]+A[N-1]);
	}
}
