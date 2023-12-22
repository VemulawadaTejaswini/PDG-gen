import java.util.*;

public class Main {
	int N, K;
	List<Integer> h;
	long[] costs;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		K = in.nextInt();
		h = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			h.add(in.nextInt());
		}
		in.close();

		costs = new long[N];
		costs[0] = 0;
		for (int i = 1; i < Math.min(K, N); ++i) {
			costs[i] = Math.abs(h.get(i) - h.get(0));
		}
	}

	void calc() {
		for (int i = 1; i < N; ++i) {
			int start = Math.max(0, i - K);
			long diffMin = Long.MAX_VALUE;
			for (int j = start; j < i; ++j) {
				diffMin = Math.min(diffMin, Math.abs(h.get(i) - h.get(j)) + costs[j]);
				// System.out.println(i + ", " + j + ", " + diffMin);
			}
			costs[i] = diffMin;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.costs[ins.N - 1]);
	}

}