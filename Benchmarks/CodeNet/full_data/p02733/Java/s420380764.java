import java.util.*;
import java.io.*;

public class Main {
	
	public static String fix(String s, int h) {
		while(s.length() < h)
			s = "0" + s;
		return s;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
		int[][] mat = new int[h][w];
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				mat[i][j] = Integer.parseInt("" + s.charAt(j));
			}
		}
		
		int min = h + w;
		big: for(int prm = 0; prm < (1 << (h - 1)) - 1; prm++) {
			int b = Integer.bitCount(prm);
			String s = fix(Integer.toBinaryString(prm), h);
			int[] count = new int[b + 1];
			
			int c = b;
			int pre = -1;
			for(int i = 0; i < w; i++) {
				int[] newCount = new int[b + 1];
				int idx = 0;
				for(int j = 0; j < h; j++) {
					if(j > 0 && (s.charAt(s.length() - j) == '1'))
						idx++;
					newCount[idx] += mat[j][i];
				}
				boolean flag = true;
				for(int u = 0; u <= b; u++) {
					count[u] += newCount[u];
					if(count[u] > k) {
						flag = false;
						break;
					}
				}
				
				if(!flag) {
					c++;
					if(pre == i - 1) {
						continue big;
					} else {
						pre = i;
					}
					for(int u = 0; u <= b; u++) {
						count[u] = newCount[u];
					}
				}
			}
			
			min = Math.min(min, c);
		}
		
		pw.println(min);
		pw.flush();
	}

	public static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
