import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		
//		//test modpow
//		System.out.println(modpow(7,0));
//		System.out.println(modpow(2,4));
//		System.out.println(modpow(3,5));
//		if(true)return;
		
		long ans = 0;
		for(int i=0;i<60;i++) {
			int cnt = 0;
			for(int j=0;j<N;j++) {
				if(((A[j]>>i)&1)==1) cnt++;
			}
			long tmp = (long)cnt*(N-cnt) %mod;
			//ans += tmp<<i;
			long mul = modpow(2, i);
			ans += (tmp * mul % mod);
			ans %= mod;	
		}
		System.out.println(ans);
	}
	
	static long modpow(long x, long y) {
		if(y==0) return 1;
		if(y%2==0) {	
			long halfY = y/2;
			long root = modpow(x, halfY);
			return root*root %mod;
		}else {
			return x * modpow(x, y-1) % mod;
		}
	}
	
}