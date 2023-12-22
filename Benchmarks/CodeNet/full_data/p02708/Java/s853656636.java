import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		final int mod = 1000000007;
		
		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		long ans = 0;
		
		long hidari = 0;
		for(int h=0; h<K; h++) {
			hidari += h;
			hidari %= mod;
		}
		long migi = 0;
		for(int m=0; m<K; m++) {
			migi += N-m;
			migi %= mod;
		}
		
		for(int i=K; i<=N+1; i++) {
				ans += (migi + mod - hidari + 1) % mod;
				ans %= mod;
				migi += (N-i);
				migi %= mod;
				hidari += i; 
				hidari %= mod;
		}
		
		System.out.print(ans%mod);
		keyboard.close();
	}
}
