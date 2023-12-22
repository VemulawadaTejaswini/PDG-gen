import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> s = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
//		int[] s = new int[M];
//		int[] c = new int[M];
		int ans = -1;
		boolean noans = false;
		if (M == 0) {
			ans = (int)Math.pow(10, N-1);
			noans = true;
		}
		for (int i = 0; i < M; i++) {
			int sa = sc.nextInt();
			int ca = sc.nextInt();
			if (s.contains(sa) && c.contains(ca)) {
				continue;
			}
			if ((s.contains(sa) && !c.contains(ca)) || (N != 1 && sa == 1 && ca == 0)) {
				noans = true;
				break;
			}
			s.add(sa);
			c.add(ca);
		}
		if (!noans) {
			if (!s.contains(1)) {
				s.add(1);
				c.add(1);
			}
			ans = 0;
			for (int i = 0; i < s.size(); i++) {
				ans = ans + (int)(Math.pow(10 , N - s.get(i))*c.get(i));
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