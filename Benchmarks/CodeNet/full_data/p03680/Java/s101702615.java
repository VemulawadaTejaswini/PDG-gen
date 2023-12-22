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
		int n = in.nextInt(), x;
		int[] a = new int[n+1];
		int[] visit = new int[n+1];
		Queue<Integer> Q = new ArrayDeque<Integer>();
		int ans = 0;
		
		for (int i=1; i<=n; ++i) {
			a[i] = in.nextInt();
		}
		
		Arrays.fill(visit, -1);
		visit[1] = 0;
		Q.add(1);
		while (!Q.isEmpty()) {
			x = Q.poll();
			if (visit[a[x]] == -1) {
				if (a[x] == 2) {
					ans = visit[x] + 1;
					out.println(ans);
					return;
				}
				visit[a[x]] = visit[x] + 1;
				Q.add(a[x]);
			}
		}
		
		out.println(-1);
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