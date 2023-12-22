import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {


	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for (int i = 0 ; i < n ; ++i) {
			arr[i] = sc.nextLong();
		}
		long pre[] = new long[n], suf[] = new long[n];
		pre[0] = arr[0];
		suf[n - 1] = arr[n - 1];
		for (int i = 1 ; i < n ; ++i) {
			pre[i] += arr[i] + pre[i - 1];
		}
		suf[n - 1] = arr[n - 1];
		for (int i = n - 2 ; i >= 0 ; --i) {
			suf[i] = arr[i] + suf[i + 1];
		}
		long bestFront[][] = new long[n][2];
		long bestBack[][] = new long[n][2];
		TreeSet<Long> sums = new TreeSet();
		sums.add(arr[0]);
		for (int i = 1 ; i < n - 2; ++i) {
			long sum = pre[i];
		
			Long before = sums.floor(sum / 2);
			Long after = sums.ceiling(sum / 2);
			
			//System.out.println(sum +" "+before +" "+after);
			if ( before == null || ( after != null && Math.abs((sum - after) - after) < Math.abs( (sum - before) - before))) {
				bestFront[i][0] = sum - after;
				bestFront[i][1] = after;
			} else {
				bestFront[i][0] = sum - before;
				bestFront[i][1] = before;
			}
			sums.add(pre[i]);
			
		}
		sums.clear();
		sums.add(arr[n - 1]);
		for (int i = n - 2 ; i > 1  ; --i) {
			long sum = suf[i];
			Long before = sums.floor(sum / 2);
			Long after = sums.ceiling(sum / 2);
			if ( before == null || ( after != null && Math.abs((sum - after) - after) < Math.abs( (sum - before) - before))) {
				bestBack[i][0] = sum -after;
				bestBack[i][1] = after;
			} else {
				bestBack[i][0] = sum - before;
				bestBack[i][1] = before;
			}
			//System.out.println(i +" "+bestBack[i][0] +" "+ bestBack[i][1]);
			sums.add(suf[i]);
		}
		long ans = 1L << 59;
		for (int i = 1 ; i < n - 2 ; ++i) {
			ArrayList<Long> res = new ArrayList();
			for (int j = 0 ; j < 2 ; ++j) {
				res.add(bestFront[i][j]);
				res.add(bestBack[i + 1][j]);
			}
			Collections.sort(res);
			ans = Math.min(ans, res.get(res.size() - 1) - res.get(0));
		}
		System.out.println(ans);
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
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

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}


