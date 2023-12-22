import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			char[] s = in.next().toCharArray();
			ArrayList<Character> a = new ArrayList<>();
			for (int i = 0; i < s.length; i++) {
				a.add(s[i]);
			}
			int i = 0;
			int j = s.length - 1;
			int count = 0;
			while (i < j) {
				if (a.get(i) == a.get(j)) {
					i++;
					j--;
				} else if (a.get(i) == 'x' && a.get(j) != 'x') {
					count++;
					i++;
					a.add(j + 1, 'x');
				} else if (a.get(i) != 'x' && a.get(j) == 'x') {
					a.add(i, 'x');
					count++;
					i++;
				} else {
					out.println(-1);
					return;
				}
			}
			out.println(count);
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

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextFloat() {
			return Double.parseDouble(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
}