import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;
	long[] Persons;

	public void init() {
		N = 0;
		cnt = 0;
		Persons = new long[256];
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		switch (str.charAt(0)) {
		case 'M':
			Persons['M']++;
			break;
		case 'A':
			Persons['A']++;
			break;
		case 'R':
			Persons['R']++;
			break;
		case 'C':
			Persons['C']++;
			break;
		case 'H':
			Persons['H']++;
			break;
		}
		cnt++;
	}

	public void solve() {
		// System.out.println(Persons['M']);
		// System.out.println(Persons['A']);
		// System.out.println(Persons['R']);
		// System.out.println(Persons['C']);
		// System.out.println(Persons['H']);
		long ans = 0;
		ans += (Persons['M'] * Persons['A'] * Persons['R']);
		ans += (Persons['M'] * Persons['A'] * Persons['C']);
		ans += (Persons['M'] * Persons['A'] * Persons['H']);
		ans += (Persons['M'] * Persons['R'] * Persons['C']);
		ans += (Persons['M'] * Persons['R'] * Persons['H']);
		ans += (Persons['M'] * Persons['C'] * Persons['H']);
		ans += (Persons['A'] * Persons['R'] * Persons['C']);
		ans += (Persons['A'] * Persons['R'] * Persons['H']);
		ans += (Persons['A'] * Persons['C'] * Persons['H']);
		ans += (Persons['R'] * Persons['C'] * Persons['H']);
		System.out.println(ans);
	}
}
