import java.util.*;
import java.io.*;
class MyUtil {
	public BufferedReader br;
	public MyUtil() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public int getInt() throws IOException {
		return Integer.valueOf(br.readLine());
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
		new Tenka2019().c();
	}
}

class Tenka2019 {
	void c() throws IOException {
		MyUtil mu = new MyUtil();
		int N = mu.getInt();
		String S = mu.getString();
		int b = 0, w = 0;
		for (char c : S.toCharArray()) {
			if (c == '#') {
				b++;
			} else {
				w++;
			}
		}
		int ans = Math.min(b, w);
		int lb=0, rw = w;
		for (char c : S.toCharArray()) {
			if (c == '#') {
				lb++;
			} else {
				rw--;
			}
			ans = Math.min(ans, lb + rw);
		}
		System.out.println(ans);
	}
}