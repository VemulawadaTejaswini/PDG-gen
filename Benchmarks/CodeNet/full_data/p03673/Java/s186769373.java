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
	
	public void solve(InputReader in, PrintWriter out) {
		int n = in.nextInt(), m = 0;
		int[] a = new int[n+1];
		int[] b = new int[n];
		
		for (int i=1; i<=n; ++i)
			a[i] = in.nextInt();
		
		if (n%2 == 1) {
			for (int i=n; i>0; i-=2) {
				b[m++] = a[i];
			}
			for (int i=2; i<=n; i+=2) {
				b[m++] = a[i];
			}
		} else {
			for (int i=n; i>0; i-=2) {
				b[m++] = a[i];
			}
			for (int i=1; i<=n; i+=2) {
				b[m++] = a[i];
			}
		}
		
		for (int i=0; i<n; ++i) {
			if (i == n-1)
				out.println(b[i]);
			else
				out.print(b[i] + " ");
		}
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
