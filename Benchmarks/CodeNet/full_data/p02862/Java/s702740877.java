import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main implements Runnable {
    public static void main(String[] args){
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
	public void run(){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int MOD = 1000000007;
		
		// 計算
		long result = 0;
		if((x + y)%3 != 0){
		    System.out.println(result);
		    return;
		}
		
		result = combination((x+y)/3, (2*x-y)/3, MOD);
		
		// 出力
		System.out.println(result);
      　System.gc();
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
	
	public static long combination(int n, int k, long MOD) {
	    if(n < k) return 0;
	    long[] f = fact(n, MOD);
	    long a = f[n];
	    long b = pow(f[k], MOD - 2, MOD);
	    long c = pow(f[n - k], MOD - 2, MOD);
	    return (((a*b)%MOD)*c)%MOD;
	}
}


