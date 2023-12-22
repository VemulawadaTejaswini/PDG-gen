

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Map<Integer, Set<Integer>> children;
	static long[] points;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			points = new long[N];
			int Q = sc.nextInt();
			children = new HashMap<>();
			for (int i = 0; i < N - 1; i++) {
				int parent = sc.nextInt();
				int child = sc.nextInt();
				Set<Integer> set = children.get(parent);
				if (set == null) {
					set = new HashSet<>();
				}
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
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				sb.append(points[i]);
				sb.append(" ");
			}
			System.out.print(sb.toString());
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
