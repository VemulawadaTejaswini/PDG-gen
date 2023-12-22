import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] a;
	Queue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return -1 * Integer.compare(o1, o2);
		}
	});
	Deque<Integer> result = new ArrayDeque<>();
	Map<Integer, Set<Integer>> conds;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.a = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			this.a[i] = Integer.parseInt(tokens[i]) - 1;
		}
		for (int i = N - 1; i >= 0; --i) {
			que.add(i);
		}
		this.conds = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			int invalidVal = a[i];
			if (!conds.containsKey(invalidVal)) {
				conds.put(invalidVal, new HashSet<>());
			}
			conds.get(invalidVal).add(i);
		}
	}

	int getValue(Set<Integer> invalids) {
		int result = -1;
		List<Integer> list = new ArrayList<>(que.size());
		while (!que.isEmpty()) {
			int val = que.poll();
			if (!invalids.contains(val)) {
				result = val;
				break;
			} else {
				list.add(val);
			}
		}
		que.addAll(list);
		return result;
	}

	void calc() {
		// 順に入れていく
		// 最後の要素は自由
		result.addFirst(que.poll());
		int right = result.getFirst();
		for (int i = 0; i < N - 1; ++i) {
			int value = getValue(this.conds.get(right));
			if (value < 0) {
				result = null;
				break;
			}
			result.addFirst(value);
			right = value;
		}
	}

	void showResult() {
		if (result == null) {
			System.out.println("-1");
		} else {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append((result.poll() + 1));
			for (int i = 1; i < N; ++i) {
				strBuilder.append(" " + (result.poll() + 1));
			}
			System.out.println(strBuilder.toString());
		}
	}
}