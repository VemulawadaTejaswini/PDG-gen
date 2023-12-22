import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	int N, M;
	Set<Integer> A;
	Map<Integer, Integer> cost;
	int[] baseCost = { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
	int[] baseOrder = { 1, 7, 4, 5, 3, 2, 9, 6, 7 };
	List<Integer> searchOrder;
	Deque<Integer> result;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		A = new HashSet<>();
		tokens = in.nextLine().split(" ");
		cost = new HashMap<>();
		searchOrder = new ArrayList<>();
		for (int i = 0; i < M; ++i) {
			int val = Integer.parseInt(tokens[i]);
			A.add(val);
		}
		for (int i = 0; i < baseOrder.length; ++i) {
			if (A.contains(baseOrder[i])) {
				searchOrder.add(baseOrder[i]);
			}
		}
		in.close();
		result = new ArrayDeque<>();
	}

	boolean search(int num) {
		if (num < 0) {
			return false;
		}
		if (num == 0) {
			return true;
		}
		for (int i = 0; i < searchOrder.size(); ++i) {
			int val = searchOrder.get(i);
			result.add(val);
			boolean r = search(num - baseCost[val - 1]);
			if (r) {
				return true;
			} else {
				result.pollLast();
			}
		}
		return false;
	}

	void calc() {
		search(N);
	}

	void show() {
		List<Integer> list = new ArrayList<>(result.size());
		list.addAll(result);
		Collections.sort(list);
		Collections.reverse(list);
		for (int i = 0; i + 1 < list.size(); ++i) {
			System.out.print(list.get(i));
		}
		System.out.println(list.get(list.size() - 1));
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}

}