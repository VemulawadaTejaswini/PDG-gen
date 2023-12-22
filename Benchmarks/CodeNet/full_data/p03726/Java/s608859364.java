import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, List<Integer>> mapList = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (!mapList.containsKey(a)) {
				mapList.put(a, new ArrayList<Integer>());
			}
			if (!mapList.containsKey(b)) {
				mapList.put(b, new ArrayList<Integer>());
			}
			mapList.get(a).add(b);
			mapList.get(b).add(a);
		}
		if (judge(N, mapList)) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}

	private boolean judge(int N, Map<Integer, List<Integer>> graph) {
		for (int a = 1; a <= N; a++) {
			List<Integer> adjList = graph.get(a);
			int oddPathCount = 0;
			for (int adjNode : adjList) {
				int length = path(a, adjNode, graph);
				if (length % 2 == 1) {
					oddPathCount++;
				}
			}
			if (oddPathCount > 1) {
				return true;
			}
		}
		return false;
	}

	private int path(int origin, int next, Map<Integer, List<Integer>> graph) {
		List<Integer> targetList = graph.get(next);
		if (targetList.size() > 2) {
			return 0;
		}
		for (int target : targetList) {
			if (target != origin) {
				int result = path(next, target, graph);
				if (result == 0) {
					return 0;
				} else {
					return result + 1;
				}
			}
		}
		return 1;
	}
}