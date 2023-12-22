import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		long ans = 1;
		long Mod = 1000000007L;
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextLong();
			ans = ( (ans%Mod)*(A[i]%Mod) )%Mod;
		}
		Arrays.sort(A);
		int a = 0;
		for( int i=0; i<N; i++ ){
			if( A[i]%A[0]!=0 ){
				a = 1;
				break;
			}
		}
		int Least = 0;
		if( a==0 ){
			Least = A[0];
		}else{
			for( int i=1; i*i<=A[0]; i++ ){
				if( A[0]%i==0 ){
					for( int k=0; k<N; k++ ){
						if( A[k]%i!=0 ){
							break;
						}
						if( k==N-1 ){
							Least = i;
						}
					}
				}
			}
		}
		ans = (ans/Least)%Mod;
		long answer = 0;
		for( int i=0; i<N; i++ ){
			answer += (ans/A[i])%Mod;
			answer = answer%Mod;
		}
		System.out.println(answer);
	}
}
