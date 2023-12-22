import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		long MOD = 1000000007;
		
		// 計算
		long result = 0;
		
		// 出力
		for(int i = 1; i <= k; i++){
		    result = (combination(n-k+1, i, MOD)*combination(k-1, i-1, MOD))%MOD;
		    System.out.println(result);
		}
		//System.out.println(result);
	}
	
	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a);
	        }
	        a=(a*a);
	        n>>=1;
	    }
	    return res;
	}
	
	public static long pow(long a,long n, long MOD) {
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
	
	public static long fact(long n) {
	    if(n == 0) return 1;
	    return n * fact(n - 1);
	}
	
	public static long fact(long n, long MOD) {
	    if(n == 0) return 1;
	    return (n * fact(n - 1, MOD))%MOD;
	}
	
	public static long combination(long n, long k) {
	    return fact(n)/(fact(k)*fact(n - k));
	}
	
	public static long combination(long n, long k, long MOD) {
	    long a = fact(n, MOD);
	    long b = pow(fact(k, MOD), MOD - 2, MOD);
	    long c = pow(fact(n - k, MOD), MOD - 2, MOD);
	    return (((a*b)%MOD)*c)%MOD;
	}
}