import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readS(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
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
		Q = Integer.parseInt(strArr[1]);
		G = new int[N + 1];
		for (int i = 1; i <= N; i++)
			G[i] = 1;
	}

	int Q;
	int[] G;

	public void readS(String str) {
		Idx = new HashMap<Character, ArrayList<Integer>>();
		for (int i = 0; i < N; i++) {
			if (!Idx.containsKey(str.charAt(i))) {
				Idx.put(str.charAt(i), new ArrayList<Integer>());
			}
			Idx.get(str.charAt(i)).add(i + 1);
		}
	}

	HashMap<Character, ArrayList<Integer>> Idx;

	public boolean hasNext() {
		// return cnt < N;
		return cnt < Q;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		char t = strArr[0].charAt(0);
		char d = strArr[1].charAt(0);
		if (Idx.containsKey(t)) {
			for (int i : Idx.get(t)) {
				if (d == 'L') {
					if (i > 0)
						G[i - 1] += G[i];
				} else {
					if (i < N)
						G[i + 1] += G[i];
				}
				G[i] = 0;
			}
		}
		cnt++;
	}

	public void solve() {
		int ans = 0;
		for (int i = 1; i <= N; i++)
			ans += G[i];
		System.out.println(ans);
	}
}
