import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		// solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		int ans = 0;
		for (int i = 1; i < N; i++) {
			String a = str.substring(0, i);
			String b = str.substring(i);
			// System.out.println(a + "-" + b);
			HashSet<Character> aset = new HashSet<Character>();
			for (int j = 0; j < a.length(); j++)
				aset.add(a.charAt(j));
			HashSet<Character> bset = new HashSet<Character>();
			for (int j = 0; j < b.length(); j++)
				bset.add(b.charAt(j));
			int cnt = 0;
			for (Character c : aset)
				if (bset.contains(c))
					cnt++;
			if (cnt > ans)
				ans = cnt;
		}
		System.out.println(ans);
		cnt++;
	}

	public void solve() {

	}
}
