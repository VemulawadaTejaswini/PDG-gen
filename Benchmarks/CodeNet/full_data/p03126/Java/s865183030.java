import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int N = in.nextInt();
			int M = in.nextInt();
			List<Integer> list = new ArrayList<>();
			int tmp = 0;
		    for(int i = 0; i < N; i++) {
		    	tmp = in.nextInt();
		    	for(int j = 0; j < tmp; j++) {
		    		list.add(in.nextInt());
		    	}
		    }
		    int count = 0;
		    int ans = 0;
		    Collections.sort(list);
		    for(int i = 1; i < list.size(); i++) {
		    	if(list.get(i) == list.get(i - 1)) {
		    		count++;
		    		if(count == N - 1) {
		    			ans++;
		    		}
		    	}else {
		    		count = 0;
		    	}
		    }
		    if(N == 1) {
		    	ans = list.size();
		    }
		    out.println(ans);
		}
	}
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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
	}
}
