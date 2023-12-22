import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger val, ans = BigInteger.valueOf(0), x, y, res, MOD = BigInteger.valueOf(1000000007), arr[] = new BigInteger[10005] ;
		int n ;
		n = sc.nextInt() ;
		for(int i = 0; i < n; i++) {
			val = sc.nextBigInteger() ;
			arr[i] = val ;
		}
		res = arr[0] ;
		for(int i = 1; i < n; i++) {
			x = res.multiply(arr[i]) ;
			y = res.gcd(arr[i]) ;
			res = x.divide(y) ;
		}
		
		for(int i = 0; i < n; i++ ) {
			x = res.divide(arr[i]) ;
			x = x.mod(MOD) ;
			ans = ans.add(x) ;
			ans = ans.mod(MOD) ;
		}
		System.out.println(ans) ;
	}
}
