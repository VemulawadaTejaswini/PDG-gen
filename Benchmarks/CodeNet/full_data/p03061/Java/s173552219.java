import java.util.*;
import java.io.*;
class MyUtil {
	public BufferedReader br;
	public MyUtil() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public long getLong() throws IOException {
		return Long.valueOf(br.readLine());
	}

	public int getInt() throws IOException {
		return Integer.valueOf(br.readLine());
	}

	public int[] splitIntArray(int N, int offset) throws IOException {
		int[] ret = new int[N + offset];
		String[] s = br.readLine().split(" ");
		for (int i=0; i < N; ++i) {
			ret[i + offset] = Integer.valueOf(s[i]);
		}
		return ret;
	}

	public int[] getIntArray(int N) throws IOException {
		int[] ret = new int[N];
		for (int i=0; i < N; ++i) {
			ret[i] = Integer.valueOf(br.readLine());
		}
		return ret;
	}

	public String getString() throws IOException {
		return br.readLine();
	}

	public String[] getSplitString(String delim) throws IOException {
		return br.readLine().split(delim);
	}

	public String[] getStringArray(int N) throws IOException {
		String[] ret = new String[N];
		for (int i=0; i < N; ++i) {
			ret[i] = br.readLine();
		}
		return ret;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		new ABC125().c();
	}
}

class ABC125 {
	int gcd(int x, int y) {
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}

	void c() throws IOException {
		MyUtil mu = new MyUtil();
		int N = mu.getInt();
		int[] A = mu.splitIntArray(N, 1);
		int[] L = new int[N + 2];
		int[] R = new int[N + 2];
		for (int i=1; i <= N; ++i) {
			L[i] = gcd(L[i - 1], A[i]);
		}
		for (int i=N; i >= 1; --i) {
			R[i] = gcd(R[i + 1], A[i]);
		}
		int ans = 1;
		for (int i=1; i <= N; ++i) {
			int g =gcd(L[i - 1], R[i + 1]);
			ans = Math.max(ans, g);
		}
		System.out.println(ans);
	}
}