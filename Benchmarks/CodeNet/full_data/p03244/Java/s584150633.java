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
		new ARC103().a();
	}
}

class ARC103 {
	void a() throws IOException {
		MyUtil mu = new MyUtil();
		int N = mu.getInt();
		int[] v = mu.splitIntArray(N, 0);
		int NMAX = 100000;
		int[][] cnt = new int[2][NMAX + 1];
		cnt[0] = new int[NMAX + 1];
		cnt[1] = new int[NMAX + 1];
		for (int i=0; i < N; ++i) {
			cnt[i % 2][v[i]]++;
		}
		int emax =0, ei=0, omax = 0, oi=1;
		for (int i=1; i <= NMAX; ++i) {
			if (emax < cnt[0][i]) {
				emax = cnt[0][i];
				ei = i;
			}
			if (omax < cnt[1][i]) {
				omax = cnt[1][i];
				oi = i;
			}
		}		
		int ans = N - emax - omax;
		if (ei == oi) {
			ans = N / 2;
		}
		System.out.println(ans);
	}
}