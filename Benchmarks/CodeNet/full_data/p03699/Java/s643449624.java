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

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		Score = new int[N];
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int[] Score;

	public void readBody(String str) {
		// System.out.println(str);
		Score[cnt] = Integer.parseInt(str);
		cnt++;
	}

	public void solve() {
		int sum = 0;
		int min = 101;
		for (int s : Score) {
			sum += s;
			if (s % 10 != 0 && s < min)
				min = s;
		}
		if (sum % 10 != 0)
			System.out.println(sum);
		else if (min > 100)
			System.out.println(0);
		else
			System.out.println((sum - min));
	}

}
