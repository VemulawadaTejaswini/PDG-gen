import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		long[] result = new long[k];
		for(int i = 1; i <= k; i++){
		    // n-k+1Ci % 1000000007
		    long a = 1;
		    long b = 1;
		    for(int j = 1; j <= i; j++){
		        a = a * ((n - k + 1) - (j - 1));
		        a %= 1000000007;
		        b = b * j;
		        b %= 1000000007;
		    }
		    
		    // k-1Ci-1
		    long c = 1;
		    long d = 1;
		    for(int j = 1; j <= i - 1; j++){
		        c = c * ((k - 1) - (j - 1));
		        c %= 1000000007;
		        d = d * j;
		        d %= 1000000007;
		    }
		    long x = (long)(a*c)%1000000007;
		    long y = (long)(pow((b*d), 1000000005)%1000000007);
		    result[i-1] = (long)(x*y)%1000000007;

		}

		// 出力
		for(int i = 0; i < k; i++){
		    System.out.println(result[i]);
		}
	}

	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%1000000007;
	        }
	        a=(a*a)%1000000007;
	        n>>=1;
	    }
	    return res;
	}
	
}
