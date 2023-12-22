import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] h = new long[N];
		for( int i=0; i<N; i++ ){
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);
		long[] dis = new long[N-1];
		for( int i=0; i<N-1; i++ ){
			dis[i] = h[i+1]-h[i]; 
		}
		long ans = 0;
		for( int i=0; i<K-1; i++ ){
			ans += dis[i];
		}
		long minium = 1000000000L;
		for( int i=1; i<N-K; i++ ){
			ans = ans - dis[i-1] + dis[i-1+K];
			minium = Math.min(ans,minium);
		}
		System.out.println(minium);
	}
}
