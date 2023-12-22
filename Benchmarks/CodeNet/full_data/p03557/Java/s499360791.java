import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));

		int n = sc.nextInt();
		
		TreeSet<Integer> aSet = new TreeSet<>();
		TreeSet<Integer> bSet = new TreeSet<>();
		TreeSet<Integer> cSet = new TreeSet<>();
		
		for (int j = 0; j < n; j++) {
			aSet.add(sc.nextInt());
		}
		for (int j = 0; j < n; j++) {
			bSet.add(sc.nextInt());
		}
		for (int j = 0; j < n; j++) {
			cSet.add(sc.nextInt());
		}
		
		
		int ans = 0;
		for (Integer integer : bSet) {
			NavigableSet<Integer> lowerSet = aSet.headSet(integer, false);
			NavigableSet<Integer> upperSet = cSet.tailSet(integer, false);
			ans += lowerSet.size() * upperSet.size();
		}
		out.println(ans);
		out.close();
	}



	//-----------http://codeforces.com/blog/entry/7018---------------------------------
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	//--------------------------------------------------------

}

