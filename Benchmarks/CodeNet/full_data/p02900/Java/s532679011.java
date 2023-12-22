import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    static long result = 1;
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = gcd(a,b);
		ArrayList<Long> list = new ArrayList<Long>();
		//System.out.println("n:" + n);
		// 計算
		func(n, 2, 0);
		// 出力
		System.out.println(result);
        
	}
	
	static long gcd(long x, long y){
	    if(x < y){
	        long temp = x;
	        x = y;
	        y = temp;
	    }
	    if(y == 0) return x;
	    if(x%y == 0) return y;
	    return gcd(y , x%y);
	}
	
	public static int func(long num, long m, long k) {
	    if(num == 1) return 0;
	    if(num%m == 0){
	        if(k == 0) result++;
	        k++;
	        func(num/m, m, k);
	    }else{
	        func(num, m + 1, 0);
	    }
	    return 0;
	}
}