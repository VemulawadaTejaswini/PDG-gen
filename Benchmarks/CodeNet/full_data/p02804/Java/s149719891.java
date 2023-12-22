import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long MOD = 1000000007;
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		// 計算
		long result = 0;
		long[] fact = fact(n, MOD);
		long[] invFact = invFact(n, fact, MOD);
		
		if(k == 1){
		    System.out.println(result);
		    return;
		}
		for(int i = 0; i < n-k+1; i++){
		    long min = a[i];
		    for(int j = i+1; j < n; j++){
		        long max = a[j];
		        long f = max - min;
		        result += f*combination(j-i-1, k-2, fact, invFact, MOD)%MOD;
		        result %= MOD;
		    }
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
	
	public static long[] fact(int n, long MOD) {
	    long[] f = new long[n+1];
	    for(int i = 0; i < n+1; i++){
	        if(i == 0) f[i] = 1;
	        if(i > 0) f[i] = (f[i-1]*i)%MOD;
	    }
	    return f;
	}
	
	public static long[] invFact(int n, long[] fact, long MOD) {
	    long[] f = new long[n+1];
	    for(int i = 0; i < n+1; i++){
	        f[i] = pow(fact[i], MOD - 2, MOD);
	    }
	    return f;
	}
	
	public static long combination(int n, int k, long[] fact, long[] invFact, long MOD) {
		if(n < 0 || k < 0) return 0;
	    if(n < k) return 0;
	    long a = fact[n];
	    long b = invFact[k];
	    long c = invFact[n-k];;
	    return (((a*b)%MOD)*c)%MOD;
	}
	
	
}


