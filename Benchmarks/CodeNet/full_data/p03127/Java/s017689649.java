import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		for( int i=1; i<N; i++ ){
			A[i] = A[i]%A[0];
		}
		Arrays.sort(A);
		long ans = A[0];
		for( int i=0; i<N; i++ ){
			if( A[i]>0 ){
				if( A[N-1]%A[i]!=0 ){
					ans = 1;
					break;
				}else{
					ans = A[i];
				}
			}
		}
		System.out.println(ans);
	}
}