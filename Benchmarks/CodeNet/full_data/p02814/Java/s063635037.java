import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextLong()/2;
		}

		// 計算
		long result = 0;
		long lcm = 1;
		for(int i = 0; i < n; i++){
		    lcm = lcm(lcm, a[i]);
		}
		result = (m/lcm + 1)/2;
		
		// 出力
		System.out.println(result);
	}
	
	static long gcd(long x, long y){
	    if(y == 0) return x;
	    return gcd(y , x%y);
	}
	static long lcm(long x, long y){
	    return x*y/gcd(x, y);
	}
	
	
}


