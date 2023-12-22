import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
	public static void main(String args[]) throws Exception {

		@SuppressWarnings("unused")
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int x = sc.nextInt();
			if (mp.containsKey(x)) {
				mp.put(x, mp.get(x) + 1);
			} else {
				mp.put(x, 1);
			}
		}
		Map<Integer,Integer> mp2 =
			    mp.entrySet().stream()
			       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			       .limit(n)
			       .collect(Collectors.toMap(
			          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		int ans=0;
		int i=0;
		for(Integer c:mp2.values())
		{
			if(i++>=k)
			{
				ans+=c;
			}
		}
		System.out.println(ans);
		out.close();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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
}
