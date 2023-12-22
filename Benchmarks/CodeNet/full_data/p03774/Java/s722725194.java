import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNextN();) {
			solver.readN(in.readLine());
		}
		for (; solver.hasNextM();) {
			solver.readM(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int M;
	int cntN;
	int cntM;
	int[] SX;
	int[] SY;
	int[] CX;
	int[] CY;

	public void init() {
		N = 0;
		M = 0;
		cntN = 1;
		cntM = 1;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		// System.out.println(N);
		SX = new int[N + 1];
		SY = new int[N + 1];
		CX = new int[M + 1];
		CY = new int[M + 1];
	}

	public boolean hasNextN() {
		return cntN <= N;
	}

	public void readN(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		SX[cntN] = Integer.parseInt(strArr[0]);
		SY[cntN] = Integer.parseInt(strArr[1]);
		cntN++;
	}

	public boolean hasNextM() {
		return cntM <= M;
	}

	public void readM(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		CX[cntM] = Integer.parseInt(strArr[0]);
		CY[cntM] = Integer.parseInt(strArr[1]);
		cntM++;
	}

	public void solve() {
		for (int i = 1; i <= N; i++) {
			int cp = 1;
			int d = Integer.MAX_VALUE;
			for (int j = 1; j <= M; j++) {
				int dx = SX[i] > CX[j] ? SX[i] - CX[j] : CX[j] - SX[i];
				int dy = SY[i] > CY[j] ? SY[i] - CY[j] : CY[j] - SY[i];
				// System.out.println(SX[i] + " " + CX[j] + " " + dx);
				if (d > dx + dy) {
					d = dx + dy;
					cp = j;
				}
			}
			System.out.println(cp);
		}
	}
}
