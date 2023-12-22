import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		long result = 0;
		int MOD = 1000000007;
		long[] list = new long[k+1];
		for(int i = 1; i < k+1; i++){
		    list[i] = pow(k/i, n, MOD);
		}
		for(int i = k; i >= 1; i--){
		    int cnt = 2;
		    while(i*cnt <= k){
		        list[i] = list[i] + MOD - list[i*cnt];
		        list[i] %= MOD;
		        cnt++;
		    }
		}
		for(int i = 1; i < k+1; i++){
		    result += list[i]*i%MOD;
		    result %= MOD;
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static long pow(long a, long n, long MOD) {
		long res=1;
		while (n>0) {
			if ((n-n/2*2)==1) {
				res=(res*a)%MOD;
			}
			a=(a*a)%MOD;
			n>>=1;
		}
		return res%MOD;
	}
}
