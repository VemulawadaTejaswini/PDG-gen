import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));


		int N = sc.nextInt();
		String s = sc.next();

		char[] letters = s.toCharArray();
		int max=0;


		for (int i = 1; i < letters.length; i++) {
			ArrayList<Character> first = new ArrayList<>();
			ArrayList<Character> last = new ArrayList<>();

			boolean[] firstChecker = new boolean['z'-'a'+1];
			boolean[] lastChecker = new boolean['z'-'a'+1];

			for (int j = 0; j < i; j++) {
				first.add(letters[j]);
			}
			for (int j = i; j < letters.length; j++) {
				last.add(letters[j]);
			}

			for (Character character : first) {
				firstChecker['z'- character] = true;
			}
			for (Character character : last) {
				lastChecker['z'- character] = true;
			}




			int thisResult = 0;

			for (int j = 0; j < firstChecker.length; j++) {
				if (firstChecker[j] && lastChecker[j]) {
					thisResult++;
				}
			}
			if (thisResult>max) {
				max = thisResult;
			}
		}

		out.println(max);
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
