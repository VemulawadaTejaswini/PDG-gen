import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		// 計算
		long result = 0;
		long c0 = b/c - (a-1)/c;
		long d0 = b/d - (a-1)/d;
		long l = lcm(c, d);
		long cd0 = b/l - (a-1)/l;
		result = (b - a + 1) - (c0 + d0 - cd0);

		// 出力
		System.out.println(result);
		
	}
	
	static long gcd(long x, long y){
	    if(x < y){
	        long temp = x;
	        x = y;
	        y = temp;
	    }
	    if(x%y == 0) return y;
	    return gcd(y , x%y);
	}
	
	static long lcm(long x, long y){
	    return x*y/gcd(x, y);
	}
}
