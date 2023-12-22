
import java.lang.Math;
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Problem solver = new Problem();
		solver.solve(in, out);
		out.close();
	}

	// Problem Solver
	static class Problem {
		public void solve(InputReader in, PrintWriter out) {
			String s = in.next();
			boolean[] seen = new boolean[26];
			for(int i=0;i<s.length();i++){
				seen[(int)s.charAt(i)-97]=true;
			}
			for(int i=0;i<26;i++){
				if(!seen[i]){
					s=s+Character.getNumericValue('a'+i);
					System.out.print(s);
					return;
				}
			}
		}
	}
	// Insert any additional methods/classes below below

	// Do not touch
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 500000);
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