import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;
	
	long g(long a, long b) {
		return ((b+a) * (b-a+1)) /2;
	}
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long ans = 0;
		
		for(int i=K;i<=N+1;i++) {
			long a = g(0, i-1);
			long b= g(N-i+1,N);
			ans += b-a+1;
			ans %= 1000000007;
		}
		
		out.println(ans);
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, long[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long max(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long min(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
class ModInteger {
	public static long MOD = 1_000_000_007;
	private long x;

	public ModInteger(long n) {
		x = (n % MOD);
	}

	/** 和 */
	public ModInteger add(long augend) {
		return new ModInteger((x + augend) % MOD);
	}

	/** 和 */
	public ModInteger add(ModInteger augend) {
		return add(augend.x);
	}

	/** 逆元 */
	public ModInteger inv() {
		return pow(MOD - 2);
	}

	/** 商 */
	public ModInteger divide(long divisor) {
		return divide(new ModInteger(divisor));
	}

	/** 商 */
	public ModInteger divide(ModInteger divisor) {
		return multiply(divisor.inv());
	}

	/** 積 */
	public ModInteger multiply(long muultiplicand) {
		return new ModInteger((x * muultiplicand) % MOD);
	}

	/** 積 */
	public ModInteger multiply(ModInteger multiplicand) {
		return multiply(multiplicand.x);
	}

	/** 累乗 O(logN)*/
	public ModInteger pow(long n) {
		//繰り返し二乗法
		if (n == 0) {
			return new ModInteger(1);
		}
		ModInteger a = pow(n / 2);
		a = a.multiply(a);
		if (n % 2 == 1) {
			a = a.multiply(x);
		}
		return a;
	}

	/** 差 */
	public ModInteger subtract(long subtrahend) {
		return new ModInteger((x - subtrahend + MOD) % MOD);
	}

	/** 差 */
	public ModInteger subtract(ModInteger subtrahend) {
		return subtract(subtrahend.x);
	}

	/** 階乗 N!のときO(N) */
	public ModInteger factorial() {
		long ans = 1;
		for (long n = 2; n <= x; n++) {
			ans *= n;
			ans %= MOD;
		}
		return new ModInteger(ans);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof ModInteger) {
			return x == ((ModInteger) o).x;
		}
		return false;
	}

	public boolean equals(long l) {
		return x == (l % MOD);
	}

	@Override
	public int hashCode() {
		return Long.hashCode(x);
	}

	public int compareTo(long val) {
		return Long.compare(x, val);
	}

	public int compareTo(ModInteger val) {
		return compareTo(val.x);
	}

	public long longValue() {
		return x;
	}

	@Override
	public String toString() {
		return Long.toString(x);
	}

	public static ModInteger valueOf(long x) {
		return new ModInteger(x);
	}

}
