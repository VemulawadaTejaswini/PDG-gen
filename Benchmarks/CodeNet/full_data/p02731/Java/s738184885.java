import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int L = sc.nextInt();
		BigDecimal l = new BigDecimal(L);
		BigDecimal divide = l.divide(new BigDecimal(3));
		BigDecimal ans = divide.multiply(divide.multiply(divide));
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