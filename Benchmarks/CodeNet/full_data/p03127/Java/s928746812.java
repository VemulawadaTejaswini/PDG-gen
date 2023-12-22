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
		long ans = A[N-1];
		for( int i=0; i<N; i++ ){
			if( A[i]>0 ){
				if( A[N-1]%A[i]!=0 ){
					ans = 1;
					break;
				}
			}
			if( i==N-1 ){
				for( int k=0; k<N; k++ ){
					if( A[k]>0 ){
						ans = A[k];
						break;
					}
				}	
			}
		}
		System.out.println(ans);
	}
}
