import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = sc.nextIntArr(n);
		int ans = (int) 2e9;
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			
			ArrayList<Integer> b = new ArrayList<>();
			while (j < n) {
				LinkedList<Integer> a = new LinkedList<Integer>();
				while (j < n && arr[j] >= arr[i]) {
					a.add(arr[j++]);
				}
				if (a.size() >= k) {
					Collections.sort(a);
					while (a.size() >= k) {
						b.add(a.poll());
					}
				}
				j++;
			}
			Collections.sort(b);
			for (int l = 0, r = q - 1; r < b.size(); l++, r++) {
				ans = Math.min(ans, b.get(r) - b.get(l));
			}
		}
		pw.println(ans);
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
