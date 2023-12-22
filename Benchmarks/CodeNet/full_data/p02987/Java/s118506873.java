import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		String str = in.next();
		Map<String, Integer> map = new HashMap<>();
		for (int i=0; i<str.length(); i++) {
			String sub = str.substring(i,  i+1);
			if (!map.containsKey(sub))
				map.put(sub, 0);
			map.put(sub, map.get(sub)+1);
		}
		
		boolean good = true;
		for (String s: map.keySet()) {
			if (map.get(s) != 2)
				good = false;
		}
		
		System.out.println(good == true ? "Yes" : "No");
		
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