import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Map<Integer, Set<Integer>> children;
	static int[] points;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			points = new int[N];
			int Q = sc.nextInt();
			children = new HashMap<>();
			for (int i = 0; i < N-1; i++) {
				int parent = sc.nextInt();
				int child = sc.nextInt();
				Set<Integer> set = children.get(parent) != null ? children.get(parent) : new HashSet<>();
				set.add(child);
				children.put(parent, set);
			}
			for (int i = 0; i < Q; i++) {
				int parent = sc.nextInt();
				int point = sc.nextInt();
				// top
				points[parent - 1] += point;
				// branch
				addPoint(parent, point);
			}
			for (int i = 0; i < N; i++) {
				System.out.print(points[i] + " ");
			}
		}
	}

	private static void addPoint(int parent, int point) {
		Set<Integer> child = children.get(parent);
		if (child == null) {
			return;
		}
		for (int p : child) {
			points[p - 1] += point;
			addPoint(p, point);
		}
	}
}
