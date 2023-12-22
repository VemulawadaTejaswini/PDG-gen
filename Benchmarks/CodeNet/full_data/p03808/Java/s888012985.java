import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static final int gcd(List<Integer> param) {
		Integer[] p = new Integer[param.size()];
		int cnt = 0;
		for (Integer a : param) {
			p[cnt++] = a;
		}
		return gcd(p);
	}
	public static final int gcd(final Integer... param) {
		final int len = param.length;
		int g = gcd(param[0], param[1]);
		for (int i = 1; i < len - 1; i++) {
			g = gcd(g, param[i + 1]);
		}
		return g;
	}

	public static final int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int r = -1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	private static Scanner sc;

	public static void main(String[] args) {
		Main instance = new Main();
		sc = instance.new Scanner();
		instance.solve();
	}

	private void solve() {
		try {
			int n = sc.nextInt(); // n = 4
			Map<Integer, Long> param = new HashMap<Integer, Long>();
			Integer cnt = 1;
			for (int c = 0; c < n; c++) {
				param.put(cnt++, sc.nextLong());
			}
			boolean ret = ope(param);
			if (ret) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean ope(Map<Integer, Long> param) {
		// System.out.println(param);
		if (allZERO(param)) {
			return true;
		}
		if (hasMinus(param)) {
			return false;
		}
		Integer size = param.size();
		Long min = param.get(1);
		Integer minI = 1;
		for (int i = 2; i <= size; i++) {
			if (min > param.get(i)) {
				min = param.get(i);
				minI = i;
			}
		}
		// System.out.println("min" + minI);
		ope(param, minI - 1);
		return ope(param);
	}
	private boolean allZERO(Map<Integer, Long> param) {
		Integer size = param.size();
		for (int i = 1; i <= size; i++) {
			if (param.get(i) != 0) {
				return false;
			}
		}
		return true;
	}
	private boolean hasMinus(Map<Integer, Long> param) {
		Integer size = param.size();
		for (int i = 1; i <= size; i++) {
			if (param.get(i) < 0) {
				return true;
			}
		}
		return false;
	}
	private void ope(Map<Integer, Long> param, Integer s) {
		Integer size = param.size();
		for (int i = 1; i <= size; i++) {
			Integer targ = (i + s - 1) % size + 1;
			param.put(targ, param.get(targ) - i);
		}
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