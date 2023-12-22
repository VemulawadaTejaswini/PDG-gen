import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はMain3

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain3 sc = new FastScannerMain3(System.in);

		try {
			//String S = sc.nextLine().trim();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			//int[] a = new int[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();

			SqrtBig sqrtBig = new SqrtBig();

			BigDecimal a_50 = sqrtBig.sqrt(new BigDecimal(a), 50);
			BigDecimal b_50 = sqrtBig.sqrt(new BigDecimal(b), 50);
			BigDecimal c_50 = sqrtBig.sqrt(new BigDecimal(c), 50);
			BigDecimal left = a_50.add(b_50);

			if (left.compareTo(c_50) == -1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static long sqrtFloor(long x) {
		long y = (long) Math.sqrt(x);
		return x >= y * y ? y : y - 1;
	}
}

class SqrtBig {
	public static void main(String[] args) {
		BigDecimal s2_50 = sqrt(new BigDecimal(2), 50);
		System.out.println(s2_50);
		System.out.println(s2_50.multiply(s2_50));
	}

	public static BigDecimal sqrt(BigDecimal a, int scale) {
		//とりあえずdoubleのsqrtを求める
		BigDecimal x = new BigDecimal(
				Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
		if (scale < 17)
			return x;

		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < scale; tempScale *= 2) {
			//x = x - (x * x - a) / (2 * x);
			x = x.subtract(
					x.multiply(x).subtract(a).divide(
							x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
		}
		return x;
	}
}

//高速なScanner
class FastScannerMain3 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain3(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
