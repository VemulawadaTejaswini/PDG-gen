import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long x = sc.nextLong();
		
		// 計算
	    long result = dfs(n, x);

		// 出力
		System.out.println(result);
        
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
	
	public static long len(int n) {
	    return pow(2, n+2) - 3;
	}
	
	public static long p(int n) {
	    return pow(2, n+1) - 1;
	}
	
	public static long dfs(int n, long x) {
	    if(x == 0) return 0;
	    if(n == 0) return 1;
	    long len = len(n-1);
	    if(x <= 1 + len){
	        return dfs(n-1, x-1);
	    }else{
	        return p(n-1) + 1 + dfs(n-1, x-2-len);
	    }
	}
}