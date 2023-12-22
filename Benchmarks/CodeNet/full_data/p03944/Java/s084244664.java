import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arg = br.readLine().split(" ");
		int w = Integer.parseInt(arg[0]);
		int h = Integer.parseInt(arg[1]);
		int n = Integer.parseInt(arg[2]);
		int wa[] = new int[n];
		int ha[] = new int[n];
		int aa[] = new int[n];
		for (int i = 0; i < n; i++) {
			arg = br.readLine().split(" ");
			wa[i] = Integer.parseInt(arg[0]);
			ha[i] = Integer.parseInt(arg[1]);
			aa[i] = Integer.parseInt(arg[2]);
		}

		Solver sol = new Solver();
		System.out.println(sol.solve(wa, ha, aa, w, h));
	}

}

class Solver {

	int solve(int[] wa, int[] ha, int[] aa, int w, int h) {

		int xLT = w, xGT = 0, yLT = h, yGT = 0;
		for (int i = 0; i < wa.length; i++) {
			int tempXLT = 0, tempXGT = 0, tempYLT = 0, tempYGT = 0;
			if (aa[i] == 1) {
				tempXGT = wa[i];
				if (xGT < tempXGT)
					xGT = tempXGT;

			} else if (aa[i] == 2) {
				tempXLT = wa[i];
				if (xLT > tempXLT)
					xLT = tempXLT;

			} else if (aa[i] == 3) {
				tempYGT = ha[i];
				if (yGT < tempYGT)
					yGT = tempYGT;
			} else if (aa[i] == 4) {
				tempYLT = ha[i];
				if (yLT > tempYLT)
					yLT = tempYLT;

			}
		}
		return xLT >= xGT && yLT >= yGT ? (xLT - xGT) * (yLT - yGT) : 0;

	}

}
