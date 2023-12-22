
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		Main instance = new Main();
		sc = instance.new Scanner();
		instance.solve();
	}

	private void solve() {
		try {
			calc();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void calc() throws Exception{
		int N = sc.nextInt();
		int N2 = N * 2 ;
		int[] ary = new int[N2];
		for (int i = 0; i < N2; i++) {
			ary[i] = sc.nextInt();
		}
		Arrays.sort(ary);
		int result = 0;
		for(int j = 0; j < N2; j+=2){
			int num = Math.min(ary[j], ary[j+1]);
			result += num;
		}
		System.out.println(result);
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

		public Long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public Double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
