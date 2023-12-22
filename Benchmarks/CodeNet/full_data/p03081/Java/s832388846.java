import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		Main instance = new Main();
		sc = instance.new Scanner();
		try {
			instance.solve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void solve() throws Exception {
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
		String[] M = s.split("");
		int[] G = new int[N];

		for (int i = 0; i < N; i++) {
			G[i] = 1;
		}

		for (int i = 0; i < Q; i++) {
			String ABC = sc.next();
			String LR = sc.next();
			if (!s.contains(ABC))
				continue;
			
			int start = s.indexOf(ABC);

			for (int k = start; k < N; k++) {
				if (M[k].equals(ABC)) {
					if (G[k] == 0) {
						continue;
					}
					if (LR.equals("L")) {
						if (k == 0) {
							G[k] = 0;
						} else {
							G[k - 1] += G[k];
							G[k] = 0;
						}
					} else {
						if (k == N - 1) {
							G[k] = 0;
						} else {
							G[k + 1] += G[k];
							G[k] = 0;
						}
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += G[i];
		}
		out.println(sum);
		out.flush();

	}

	private class Scanner {
		String[] s;
		int i;
		BufferedReader br;
		String regex = " ";

		public Scanner() {
			s = new String[0];
			i = 0;
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				destruction();
			}
		}

		private void destruction() throws IOException {
			if (br != null)
				br.close();
		}

		public String next() throws IOException {
			if (i < s.length)
				return s[i++];
			String st = br.readLine();
			while (st == "")
				st = br.readLine();
			s = st.split(regex, 0);
			i = 0;
			return s[i++];
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
	}
}
