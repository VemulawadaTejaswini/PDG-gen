import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		Map<Integer, Integer> hs = new HashMap<>();
		Map<Integer, Integer> ws = new HashMap<>();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int x = sc.nextInt() - 1;
				hs.put(x, i);
				ws.put(x, j);
			}
		}

		int maxSteps = (h * w / d) + 1;
		int[][] costs = new int[d][maxSteps];

		for (int i = 0; i < d; i++) {
			int ihPrev = hs.get(i);
			int iwPrev = ws.get(i);
			int steps = 1;
			while (steps < maxSteps) {
				if (i + steps * d >= h * w - 1) break;
				int ih = hs.get(i + steps * d);
				int iw = ws.get(i + steps * d);
				costs[i][steps] = Math.abs(ih - ihPrev) + Math.abs(iw - iwPrev) + costs[i][steps - 1];
				ihPrev = ih;
				iwPrev = iw;
				steps++;
			}
		}

		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (q-- > 0) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			sb.append(costs[r % d][r / d] - costs[l % d][l / d]);
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}
