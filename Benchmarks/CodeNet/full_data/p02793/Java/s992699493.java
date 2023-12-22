import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc,N);

		sc.close();

		long[] l = factor(A[0]);
		for(int i=1;i<N;i++) {
			l = lcm(l, factor(A[i]));
		}

		long ans = 0;

		for(int i=0;i<N;i++) {
			ans += tol( div(l, factor(A[i]))) ;
			ans %= MOD;
		}

		out.println(ans);
	}

	long MOD = 1000000007;

	private long tol(long[] l) {
		long result = 1;
		for(int i=0;i<l.length;i++) {
			result *= Math.pow(primes[i], l[i]);
		}
		return result;
	}

	private long[] factor(long n) {
		long[] result = new long[primes.length];

		for(int i=0;i<primes.length;i++) {
			while(n%primes[i] == 0) {
				n/=primes[i];
				result[i]++;
			}
		}
		return result;
	}

	private long[] mul(long[] a, long[] b) {
		long[] result = new long[a.length];
		for(int i=0;i<a.length;i++) {
			result[i] = a[i] + b[i];
		}
		return result;
	}

	private long[] div(long[] a, long[] b) {
		long[] result = new long[a.length];
		for(int i=0;i<a.length;i++) {
			result[i] = a[i] - b[i];
		}
		return result;

	}

	private long[] lcm(long[] a, long[] b) {
		long[] result = new long[a.length];
		for(int i=0;i<a.length;i++) {
			result[i] = Math.max(a[i] , b[i]);
		}
		return result;
	}

	static int[] primes;

	static  {
		boolean[] e = new boolean[1000];
		Arrays.fill(e, true);

		e[0] = false;
		e[1] = false;

		for(int i=2;i<=Math.sqrt(e.length);i++) {
			if(e[i]) {
				for(int j=i*i;j<e.length;j+=i) {
					e[j] = false;
				}
			}
		}

		int c =0;
		for(int i=0;i<e.length;i++) {
			if(e[i])c++;
		}

		primes = new int[c];
		int j=0;
		for(int i=0;i<e.length;i++) {
			if(e[i])
			primes[j++] = i;
		}

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
