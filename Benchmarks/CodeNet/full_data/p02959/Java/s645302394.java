import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N+1];
		long[] B = new long[N];
		for( int i=0; i<N+1; i++ ){
			A[i] = sc.nextLong();
		}
		for( int i=0; i<N; i++ ){
			B[i] = sc.nextLong();
		}
		long ans = 0;
		for( int i=0; i<N; i++ ){
			if( B[i]<=A[i] ){
				ans += B[i];
			}else{
				A[i+1] -= B[i]-A[i];
				ans += B[i];
				if( A[i+1]<0 ){
					A[i+1]=0;
				}
			}
		}
		System.out.println(ans);
	}
}
