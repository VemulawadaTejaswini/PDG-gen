import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N+1];
		long[] ans = new long[N+1];
		for( int i=1; i<=N; i++ ){
			a[i] = sc.nextLong();
		}
		int b = 1;
		int c = 1;
		if( N%2!=0 ){
			for( int i=N; i>=1; i-=2 ){
				ans[b] = a[i];
				b++;
			}
			for( int i=2; i<=N-1; i+=2 ){
				ans[b] = a[i];
				b++;
			}
		}
		if( N%2==0 ){
			for( int i=N; i>=2; i-=2 ){
				ans[c] = a[i];
				c++;
			}
			for( int i=1; i<=N-1; i+=2 ){
				ans[c] = a[i];
				c++;
			}
		}
		String ss = "A";
		for( int i=1; i<=N; i++ ){
			ss = " " + String.valueOf(ans[i]);
		}
		System.out.println(ss.substring(2));
	}
}
