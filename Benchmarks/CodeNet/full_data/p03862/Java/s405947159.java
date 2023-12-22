import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(in, out);
		out.close();
	}
}

class TaskA {
	public final static int maxn = 100005;
	public int[] a = new int[maxn];
	
	public void solve(InputReader in, PrintWriter out) {
		int n = in.nextInt(), k = in.nextInt();
		int i, j;
		int ans = 0;
		
		for (i=1; i<=n; ++i)
			a[i] = in.nextInt();
		
		if (a[1] > k) {
			ans += a[1] - k;
			a[1] = k;
		}
		for (i=2; i<=n; ++i) {
			//out.println(a[i]+a[i-1]);
			if (a[i]+a[i-1] > k) {
				ans += (a[i]+a[i-1]) - k;
				a[i] = k - a[i-1];
			}
		}
		// for (i=1; i<=n; ++i)
			// out.print(a[i] + " ");
		// out.println();
		
		out.println(ans);
	}
}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;
	
	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}
	
	public String next() {
		while (tokenizer==null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
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
