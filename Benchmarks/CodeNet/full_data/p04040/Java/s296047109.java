import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		final int MOD = 1_000_000_007;

		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		PC pc = new PC(h + w, MOD);

		long ret = 0;
		if (w - b == 1) {
			ret = (ret + (long)pc.C(w - 1 + h - a - 1, w - 1) * pc.C(a, 0)) % MOD;
		} else {
			for (int i = 0; i < h - a - 1; i++) {
				ret = (ret + (long)pc.C(b + i, i) * pc.C(w - b - 2 + h - i - 1, w - b - 2)) % MOD;
			}
			ret = (ret + (long)pc.C(b + h - a - 1, b) * pc.C(w - b - 1 + a, w - b - 1)) % MOD;
		}

		pr.println(ret);

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
    private static class PC {
    	// MOD must be prime number.
    	int MOD;
    	// fact[i] : i! % MOD
    	long[] fact;
    	// ifact[i] : 1/i! % MOD
    	long[] ifact;

    	PC(int size, int MOD) {
    		// O(size)
    		// n=sizeまでのnCrを求める。
    		// nHrはn+r-1Crになってしまうので注意

    		this.MOD = MOD;

    		fact = new long[size + 1];
    		fact[0] = 1;
    		for (int i = 1; i <= size; i++) {
    			fact[i] = fact[i - 1] * i % MOD;
    		}

    		ifact = new long[size + 1];

    		int loop = MOD - 2;
    		long x = fact[size];
    		ifact[size] = 1;
    		while (loop > 0) {
    			if (loop % 2 == 1) {
    				ifact[size] = ifact[size] * x % MOD;
    			}
    			x = x * x % MOD;
    			loop /= 2;
    		}

    		for (int i = size - 1; i >= 0; i--) {
    			ifact[i] = ifact[i + 1] * (i + 1) % MOD;
    		}

    	}

    	// 組合せの数
    	int C(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		return (int)(((fact[n] * ifact[n - r]) % MOD) * ifact[r] % MOD);
    	}

    	// 順列
    	int P(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		return (int)((fact[n] * ifact[n -r]) % MOD);
    	}

    	// 重複組み合わせ
    	// 異なるn種のものから重複を許してr個を選ぶ場合の数
    	// 0個の種類もあり得る
    	int H(int n, int r) {
    		if (n == 0 && r == 0) {
    			return 1;
    		}

    		return C(n + r - 1, r);
    	}

    	// 組合せの数(nが大きいとき)
    	//   O(r)で求めることができる。rはsizeの大きさまで
    	int C2(long n, int r) {
    		long ret = ifact[r];
    		for (int i = 1; i <= r; i++) {
    			long tmp = (n - r + i) % MOD;
    			ret = (ret * tmp) % MOD;
    		}

    		return (int)ret;
    	}

    	// 第2種スターリング数
    	// n人をちょうどr個のグループに分ける(グループの区別はなし)
    	// グループの区別をする場合はr!S(n,r)。全射の場合の数と同義
    	// O(r log n)
    	int S(long n, int r) {
    		//全射の場合の数を包除原理を使って求めて、1/r!をかける。
    		long ret = 0;
    		for (int i = 1; i <= r; i++) {
    			long tmp = (r - i) % 2 == 0 ? 1 : -1;
    			tmp *= pow(i, n) * C(r, i) % MOD;
    			ret = (ret + tmp + MOD) % MOD;
    		}
    		ret = ret * ifact[r] % MOD;

    		return (int)ret;
    	}

    	long pow(int a, long n) {
    		long loop = n;
    		long ret = 1;
    		long x = a;
    		while (loop > 0) {
    			if (loop % 2 == 1) {
    				ret = ret * x % MOD;
    			}
    			x = x * x % MOD;
    			loop /= 2;
    		}

    		return ret;
    	}
    }

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
//					it = Arrays.asList(br.readLine().split(" ")).iterator();
					it = Arrays.asList(br.readLine().split("\\p{javaWhitespace}+")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
