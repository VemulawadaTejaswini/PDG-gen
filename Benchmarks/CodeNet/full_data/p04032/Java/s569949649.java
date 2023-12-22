import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		String str = in.next();
		
		for (int i=0; i<str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				System.out.println(i + " " + (i+1));
				return;
			}
			if (i < str.length()-2 && str.charAt(i) == str.charAt(i+2)) {
				System.out.println(i + " " + (i+2));
				return;
			}
		}
		System.out.println(-1 + " " + -1);
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
	}
}