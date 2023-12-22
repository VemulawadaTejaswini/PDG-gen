import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		char[] A = new char[N];
		int ans = 0;
		for( int i=0; i<N; i++ ){
			A[i] = S.charAt(i);
		}
		for( int i=0; i<N-2; i++ ){
			for( int j=i+1; j<N-1; j++ ){
				for( int k=j+1; k<N; k++ ){
					if( k-j==j-i ){
						continue;
					}
					if( A[i]!=A[j] && A[j]!=A[k] && A[k]!=A[i] ){
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}