import java.util.*;

/**
 * year -> orderの変換を作る
 * 
 * @author glycine
 *
 */
public class Main {
	private static class Node {
		int p;
		long y;
		int order = -1;

		public Node(int p, long y) {
			this.p = p;
			this.y = y;
		}
	}

	int N, M;
	List<Node> nodes;
	Map<Integer, List<Node>> maps = new HashMap<>();
	Map<Integer, Map<Long, Integer>> infos = new HashMap<>();
	List<String> results;

	public Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		nodes = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			int p = in.nextInt();
			long y = in.nextLong();
			Node node = new Node(p, y);
			nodes.add(node);
			if (!maps.containsKey(p)) {
				maps.put(p, new ArrayList<Node>());
			}
			maps.get(p).add(node);
		}
		for (Integer p : maps.keySet()) {
			Collections.sort(maps.get(p), new Comparator<Node>() {
				@Override
				public int compare(Node o1, Node o2) {
					if (o1.y < o2.y) {
						return -1;
					} else if (o1.y > o2.y) {
						return 1;
					} else {
						return 0;
					}
				}
			});
		}
		in.close();
	}

	private void calc() {
		for (Integer p : maps.keySet()) {
			int index = 1;
			List<Node> cities = maps.get(p);
			for(int i =0 ;i < cities.size(); ++i) {
				Node city = cities.get(i);
				city.order = index;
				++index;
			}
		}
	}

	private void show() {
		for (int i = 0; i < nodes.size(); ++i) {
			Node node = nodes.get(i);
			int p = node.p;
			int order = node.order;
			String line = String.format("%06d", p) + String.format("%06d", order);
			System.out.println(line);
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}
}