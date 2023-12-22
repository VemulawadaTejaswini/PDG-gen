import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = 0;
		long N = Math.max(n,m);
		long M = Math.min(n,m);
		long Mod = 1000000007L;
		long a = 1;
		long b = 1;
		for( int i=1; i<=N; i++ ){
			a = (a*i)%Mod;
		}
		for( int i=1; i<=M; i++ ){
			b = (b*i)%Mod;
		}
		if( N-M>1 ){
			ans = 0;
		}
		if( N-M==1 ){
			ans = (a*b)%Mod;		
		}
		if( N==M ){
			ans = (a*b)%Mod;
			ans = (2*ans)%Mod;
		}
		System.out.println(ans);
	}
}
