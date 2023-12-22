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
		int sx = in.nextInt(), sy = in.nextInt();
		int tx = in.nextInt(), ty = in.nextInt();
		StringBuilder sb = new StringBuilder();
		String sud = "UD";
		String srl = "RL";
	
		for (int j=0; j<2; ++j) {
			char ch1 = sud.charAt(j), ch2 = srl.charAt(j);
			for (int i=sy; i<ty; ++i) {
				sb.append(ch1);
			}
			for (int i=sx; i<tx; ++i) {
				sb.append(ch2);
			}
		}
		
		for (int j=0; j<2; ++j) {
			char ch1 = sud.charAt(j), ch2 = srl.charAt(j);
			sb.append(srl.charAt(j^1));
			for (int i=sy; i<=ty; ++i) {
				sb.append(ch1);
			}
			for (int i=sx; i<=tx; ++i) {
				sb.append(ch2);
			}
			sb.append(sud.charAt(j^1));
		}

		out.println(sb.toString());
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

