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
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
		// solverS.solve();
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
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int X = Integer.parseInt(strArr[0]);
		initPrimeNums(X);
		int ans = X;
		for (; ans > 1 && (!check(ans)); ans--) {
		}
		System.out.println(ans);
	}

	ArrayList<Integer> PrimeNums;

	private void initPrimeNums(int x) {
		int[] pnchk = new int[x + 1];
		PrimeNums = new ArrayList<Integer>();
		for (int i = 2; i < pnchk.length; i++) {
			if (pnchk[i] >= 0) {
				for (int j = i + i; j < pnchk.length; j += i)
					pnchk[j] = -1;
				PrimeNums.add(i);
			}
		}
		// for (int i : PrimeNums)
		// System.out.print(" " + i);
		// System.out.println();
	}

	private boolean check(int num) {
		HashMap<Integer, Integer> fact = factorization(num);
		int p = 0;
		for (int b : fact.keySet()) {
			// System.out.println(num + " " + b + " " + fact.get(b));
			if (fact.get(b) < 2)
				return false;
			if (p == 0)
				p = fact.get(b);
			if (p != fact.get(b))
				return false;
		}
		return true;
	}

	private HashMap<Integer, Integer> factorization(int num) {
		HashMap<Integer, Integer> ret = new HashMap<Integer, Integer>();
		for (int n = num; n > 1;) {
			for (int b : PrimeNums) {
				if (n % b == 0) {
					n /= b;
					if (ret.containsKey(b))
						ret.put(b, ret.get(b) + 1);
					else
						ret.put(b, 1);
				}
			}
		}
		return ret;
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	public void solve() {

	}
}
