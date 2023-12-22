import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		BigDecimal a = new BigDecimal(A).divide(new BigDecimal(0.08),0,RoundingMode.UP);
		BigDecimal b = new BigDecimal(B).divide(new BigDecimal(0.1),0,RoundingMode.UP);
//		double a = A / 0.08;
//		double b = B / 0.1;
		BigDecimal min = a.compareTo(b) == -1 ? a : b; 
		BigDecimal max = a.compareTo(b) == -1 ? b : a; 
//		BigDecimal min = a < b ? new BigDecimal(a) : new BigDecimal(b); 
//		BigDecimal max = a < b ? new BigDecimal(b) : new BigDecimal(a); 
		
		int ans = -1;
		for (int i = min.intValue(); i <= max.intValue(); i++) {
			BigDecimal x = new BigDecimal(i).multiply(new BigDecimal(0.08)).setScale(0,BigDecimal.ROUND_DOWN);
			BigDecimal y = new BigDecimal(i).multiply(new BigDecimal(0.1)).setScale(0,BigDecimal.ROUND_DOWN);
			if (x.compareTo(new BigDecimal(A)) == 0 && y.compareTo(new BigDecimal(B)) == 0) {
				ans = i;
			}
		}
		System.out.println(ans);			
	}

	
	// ユークリッドの控除法(最大公約数を求める)
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	// 複数の最大公約数を求める
	private static long gcdex(long param[]) {
		long g = gcd(param[0], param[1]);
		for (int i = 1; i < param.length-1; i++) {
			g = gcd(g, param[i+1]);
		}
		return g;
	}

	// 最小公倍数を求める
	private static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	//
	private static long all(long n, long count, int N) {
		if (count == N) {
			return count;
		}
		return all(1, count, N);
	}

}