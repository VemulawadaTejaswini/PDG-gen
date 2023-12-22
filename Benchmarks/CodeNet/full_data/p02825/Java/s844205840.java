import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		if (N == 2) {
			out.println(-1);
		} else {
			char[][] ret = new char[N][N];
			
			for (int i = 0; i < N; i++) {
				Arrays.fill(ret[i], '.');
			}
			
			if (N % 3 == 0) {
				for (int i = 0; i < N; i+=3) {
					fill3(ret, i, i, 1, 'a');
				}
			} else if (N == 7) {
				fill7(ret, 0, 0, 'a');
			} else if (N == 11) {
				fill11(ret, 0, 0, 'a');
			} else {
				for (int four = 0; 4 * four <= N; four++) {
					if ((N - 4 * four) % 5 == 0) {
						int five = (N - 4 * four) / 5;
						int idx = 0;
						for (int i = 0; i < four; i++) {
							fill4(ret, idx, idx, 'a');
							idx += 4;
						}
						for (int i = 0; i < five; i++) {
							fill5(ret, idx, idx, 'a');
							idx += 5;
						}
						break;
					}
				}
			}
			
			for (int i = 0; i < N; i++) {
				out.println(new String(ret[i]));
			}
		}
		
		out.flush();
	}
	
	static void fill3(char[][] mat, int i, int j, int req, char from) {
		if (req == 1) {
			mat[i][j+1] = mat[i][j+2] = from;
			mat[i+1][j] = mat[i+2][j] = from;
		} else if (req == 2) {
			mat[i][j] = mat[i+1][j] = mat[i+1][j+2] = mat[i+2][j+2] = from;
			mat[i][j+1] = mat[i][j+2] = mat[i+2][j] = mat[i+2][j+1] = (char)(from + 1);
		}
	}
	
	static void fill4(char[][] mat, int i, int j, char from) {
		fillV(mat, i, j, from++);
		fillV(mat, i, j+1, from++);
		fillV(mat, i+2, j+2, from++);
		fillV(mat, i+2, j+3, from++);
		fillH(mat, i, j+2, from++);
		fillH(mat, i+1, j+2, from++);
		fillH(mat, i+2, j, from++);
		fillH(mat, i+3, j, from++);
	}
	
	static void fill5(char[][] mat, int i, int j, char from) {
		fill3(mat, i, j, 2, from);
		from+=2;
		for (int jj = j; jj < j + 3; jj++) {
			fillV(mat, i+3, jj, from++);
		}
		for (int ii = i; ii < i + 3; ii++) {
			fillH(mat, ii, j+3, from++);
		}
	}
	
	static void fill7(char[][] mat, int i, int j, char from) {
		fill3(mat, i, j, 1, from++);
		for (int jj = j; jj < j + 3; jj++) {
			fillV(mat, i+3, jj, from++);
			fillV(mat, i+5, jj, from++);
		}
		for (int ii = i; ii < i + 3; ii++) {
			fillH(mat, ii, j+3, from++);
			fillH(mat, ii, j+5, from++);
		}
	}
	
	static void fill11(char[][] mat, int i, int j, char from) {
		fill4(mat, i + 7, j + 7, from);
		fill3(mat, i, j, 2, from);
		from+=2;
		for (int jj = j; jj < j + 3; jj++) {
			fillV(mat, i+3, jj, from++);
			fillV(mat, i+5, jj, from--);
			fillV(mat, i+7, jj, from++);
			fillV(mat, i+9, jj, from);
		}
		for (int ii = i; ii < i + 3; ii++) {
			fillH(mat, ii, j+3, from++);
			fillH(mat, ii, j+5, from--);
			fillH(mat, ii, j+7, from++);
			fillH(mat, ii, j+9, from);
		}
		fill4(mat, i + 3, j + 3, from);
	}
	
	static void fillV(char[][] mat, int i, int j, char c) {
		mat[i][j] = mat[i+1][j] = c;
	}
	
	static void fillH(char[][] mat, int i, int j, char c) {
		mat[i][j] = mat[i][j+1] = c;
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
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
	}
}
