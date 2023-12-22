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
				for( int k=0; k<N-1; k++ ){
					if( A[k]>0 ){
						if( A[k+1]%A[k]!=0 ){
							ans = 1;
							break;
						}
					}
					if( k==N-1 ){
						for( int m=0; m<N; m++ ){
							if( A[m]>0 ){
								ans = A[m];
								break;
							}
						}
					}
				}	
			}
		}
		System.out.println(ans);
	}
}
