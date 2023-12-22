import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		// solver.readHead(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
		// solver.solve();
		solver.readN(in.readLine());
		for (; solver.hasNextN();) {
			solver.readBodyN(in.readLine());
		}
		solver.readM(in.readLine());
		for (; solver.hasNextM();) {
			solver.readBodyM(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int M;
	int cnt;

	public void init() {
		N = 0;
		M = 0;
		cnt = 0;
		Blue = new HashMap<String, Integer>();
		Red = new HashMap<String, Integer>();
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public void readN(String str) {
		N = Integer.parseInt(str);
		cnt = 0;
	}

	public void readM(String str) {
		M = Integer.parseInt(str);
		cnt = 0;
	}

	public boolean hasNextN() {
		return cnt < N;
	}

	public boolean hasNextM() {
		return cnt < M;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	HashMap<String, Integer> Blue;

	public void readBodyN(String str) {
		// System.out.println(str);
		if (Blue.containsKey(str))
			Blue.put(str, Blue.get(str) + 1);
		else
			Blue.put(str, 1);
		cnt++;
	}

	HashMap<String, Integer> Red;

	public void readBodyM(String str) {
		// System.out.println(str);
		if (Red.containsKey(str))
			Red.put(str, Red.get(str) + 1);
		else
			Red.put(str, 1);
		cnt++;
	}

	public void solve() {
		int ans = 0;
		for (String key : Blue.keySet()) {
			int n = Blue.get(key);
			if (Red.containsKey(key))
				n -= Red.get(key);
			if (n > ans)
				ans = n;
		}

		System.out.println(ans);
	}
}
