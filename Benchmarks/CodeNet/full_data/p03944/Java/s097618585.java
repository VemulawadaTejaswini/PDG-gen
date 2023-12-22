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
		int w = in.nextInt(), h = in.nextInt(), n = in.nextInt();
		int lx = 0, rx = w;
		int ly = 0, ry = h;
		int x, y, a;
		
		for (int i=0; i<n; ++i) {
			x = in.nextInt();
			y = in.nextInt();
			a = in.nextInt();
			if (a == 1) {
				lx = Math.max(lx, x);
			} else if (a == 2) {
				rx = Math.min(rx, x);
			} else if (a == 3) {
				ly = Math.max(ly, y);
			} else {
				ry = Math.min(ry, y);
			}
		}
		
		int ans = 0;
		if (ly<=ry && lx<=rx) {
			ans = (ry-ly) * (rx-lx);
		}
		
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

