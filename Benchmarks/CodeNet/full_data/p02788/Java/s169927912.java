import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long D, A;
	List<Pair> list;
	Deque<Pair> que;
	long minPoint = Long.MAX_VALUE / 2;
	long result = 0;

	static class Pair {
		long X, H;

		Pair(long X, Long H) {
			this.X = X;
			this.H = H;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		D = Long.parseLong(tokens[1]);
		A = Long.parseLong(tokens[2]);
		list = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			long x = Long.parseLong(tokens[0]);
			long h = Long.parseLong(tokens[1]);
			this.list.add(new Pair(x, h));
		}
		Collections.sort(list, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return Long.compare(o1.X, o2.X);
			}
		});
		this.que = new ArrayDeque<>(N);
		que.addAll(list);
	}

	void apply(long point) {
		long times = que.peek().H / A;
		if (que.peek().H % A != 0) {
			times++;
		}
		long hp = times * A;

		Deque<Pair> temp = new ArrayDeque<>();
		while (!que.isEmpty() && que.peek().X <= point + D) {
			Pair pair = que.pollFirst();
			pair.H = pair.H - hp;
			if (pair.H > 0) {
				temp.addLast(pair);
			}
		}
		// 戻す
		while (!temp.isEmpty()) {
			que.addFirst(temp.pollLast());
		}

		result += times;
	}

	void calc() {
		while (!que.isEmpty()) {
			// 爆弾を適用する座標を求める
			long point = que.peekFirst().X;
			point += D;
			// 爆弾をpointに対して，list.get(0)にいるモンスターを倒せる回数適用する
			apply(point);
		}
	}

	void showResult() {
		System.out.println(result);
	}
}