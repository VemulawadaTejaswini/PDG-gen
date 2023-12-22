import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N;
	String S;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		S = next();
		byte[] asciiCodes;
		try {
			asciiCodes = S.getBytes("US-ASCII");
		} catch (Exception e) {
		e.printStackTrace();
		return;
		}
		for (int i = 0; i < asciiCodes.length; i++) {
			asciiCodes[i] += N;
			if(asciiCodes[i] > 90)asciiCodes[i] -= 26;
		}

        String resultString;
        try {
            resultString = new String(asciiCodes, "US-ASCII");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        out.println(resultString);
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}