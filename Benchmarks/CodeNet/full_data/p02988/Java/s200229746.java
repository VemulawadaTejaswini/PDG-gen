import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		int res = 0;
		for (int i=1; i<n-1; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(arr[i]);
			list.add(arr[i-1]);
			list.add(arr[i+1]);
			Collections.sort(list);
			if (list.get(list.size()-2) == arr[i])
				++res;
		}
		
		System.out.println(res);
	}

	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}