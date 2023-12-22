import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.flush();
		out.close();
	}
}

class Pair {
	long first;
	long second;
	long third;

	Pair(long first, long second, long third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
}

class TaskB {

	public void solve(int testNumber, InputReader in, PrintWriter pw) {
		int N = in.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		long h[] = new long[N];
		Pair arr[] = new Pair[N];
		Pair temp = null;
		for (int i = 0; i < N; i++) {
			x[i] = in.nextLong();
			y[i] = in.nextLong();
			h[i] = in.nextLong();
			if (h[i] >= 1) {
				temp = new Pair(x[i], y[i], h[i]);
			}
		}
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				long V = temp.third + Math.abs(i - temp.first) + Math.abs(j - temp.second);
				boolean flag = true;
				for (int k = 0; k < N; k++) {
					long height = V - Math.abs(i - x[k]) - Math.abs(j - y[k]);
					if (height != h[k]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					pw.println(i + " " + j + " " + V);
					return;
				}
			}
		}

	}

	int __gcd(int a, int b) {
		if (b == 0)
			return a;
		return __gcd(b, a % b);

	}

	public int getInt(int num) {
		int ret = -1;
		switch (num) {
		case 0:
			ret = 6;
			break;
		case 1:
			ret = 2;
			break;
		case 2:
			ret = 5;
			break;
		case 3:
			ret = 5;
			break;
		case 4:
			ret = 4;
			break;
		case 5:
			ret = 5;
			break;
		case 6:
			ret = 6;
			break;
		case 7:
			ret = 3;
			break;
		case 8:
			ret = 7;
			break;
		case 9:
			ret = 6;
			break;
		}
		return ret;
	}

	public int isPow(long num) {
		int count = 0;
		while (num > 0) {
			num /= 2;
			count++;
		}
		return count;
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
