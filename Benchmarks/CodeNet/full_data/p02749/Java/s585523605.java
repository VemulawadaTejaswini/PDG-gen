import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Node[] nodes;
	boolean enable = true;

	static class Node {
		int id;
		Set<Integer> conn;
		int color;
		int number;

		Node(int id) {
			this.id = id;
			this.color = -1;
			this.conn = new HashSet<>();
			this.number = -1;
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
		N = Integer.parseInt(in.readLine());
		this.nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			this.nodes[i] = new Node(i);
		}
		for (int i = 0; i < N - 1; ++i) {
			String[] tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			nodes[a].conn.add(b);
			nodes[b].conn.add(a);
		}
	}

	void mark(int current, int parent, int color) {
		nodes[current].color = color;
		int nextColor = color == 1 ? 0 : 1;
		for (Integer next : nodes[current].conn) {
			if (next == parent) {
				continue;
			}
			mark(next, current, nextColor);
		}
	}

	void calc() {
		// 色付けをする
		mark(0, -1, 0);
		// Nodeを色ごとに振り分ける
		Map<Integer, List<Node>> map = new HashMap<>();
		for (int i = 0; i < 2; ++i) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < N; ++i) {
			int key = nodes[i].color;
			map.get(key).add(nodes[i]);
		}
		// 値を付けるpoolを用意する
		Map<Integer, Deque<Integer>> numberPools = new HashMap<>();
		for (int i = 0; i < 3; ++i) {
			Deque<Integer> deque = new ArrayDeque<>();
			for (int j = i + 1; j <= N; j += 3) {
				deque.add(j);
			}
			numberPools.put((i + 1) % 3, deque);
		}
		// 値を割り付ける
		// 色0にmod1, 色1にmod2を割り当て，残りはmod0を適当に割り振る
		// mod0, mod1とmod2
		List<Node> remains = new ArrayList<>();

		if (map.get(0).size() <= N / 3) {
			// 0側に3の倍数を割り当てる
			List<Node> list = map.get(0);
			Deque<Integer> pool = numberPools.get(0);
			for (int i = 0; i < list.size(); ++i) {
				if (!pool.isEmpty()) {
					list.get(i).number = pool.poll();
				} else {
					remains.add(list.get(i));
				}
			}
			// 残りを適当に割り当てる
			pool = new ArrayDeque<>();
			for (int i = 0; i < 3; ++i) {
				pool.addAll(numberPools.get(i));
			}
			list = map.get(1);
			list.addAll(remains);
			for (int i = 0; i < list.size(); ++i) {
				list.get(i).number = pool.poll();
			}
		} else if (map.get(1).size() <= N / 3) {
			// 1側に3の倍数を割り当てる
			List<Node> list = map.get(1);
			Deque<Integer> pool = numberPools.get(0);
			for (int i = 0; i < list.size(); ++i) {
				if (!pool.isEmpty()) {
					list.get(i).number = pool.poll();
				} else {
					remains.add(list.get(i));
				}
			}
			// 残りを適当に割り当てる
			pool = new ArrayDeque<>();
			for (int i = 0; i < 3; ++i) {
				pool.addAll(numberPools.get(i));
			}
			list = map.get(0);
			list.addAll(remains);
			for (int i = 0; i < list.size(); ++i) {
				list.get(i).number = pool.poll();
			}
		} else {
			{
				List<Node> list = map.get(0);
				Deque<Integer> pool = numberPools.get(1);
				for (int i = 0; i < list.size(); ++i) {
					if (!pool.isEmpty()) {
						list.get(i).number = pool.poll();
					} else {
						remains.add(list.get(i));
					}
				}
			}
			{
				List<Node> list = map.get(1);
				Deque<Integer> pool = numberPools.get(2);
				for (int i = 0; i < list.size(); ++i) {
					if (!pool.isEmpty()) {
						list.get(i).number = pool.poll();
					} else {
						remains.add(list.get(i));
					}
				}
			}
			{
				Deque<Integer> pool = numberPools.get(0);
				for (int i = 0; i < remains.size(); ++i) {
					remains.get(i).number = pool.poll();
				}
			}
		}
	}

	String show() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(nodes[0].number);
		for (int i = 1; i < nodes.length; ++i) {
			strBuilder.append(" " + nodes[i].number);
		}
		return strBuilder.toString();
	}

	void showResult() {
		if (!enable) {
			System.out.println("-1");
		} else {
			System.out.println(show());
		}

	}

}