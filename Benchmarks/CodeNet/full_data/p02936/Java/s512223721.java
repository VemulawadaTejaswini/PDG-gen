import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		//int[] P = new int[Q];
		//int[] X = new int[Q];
		Map<Integer, ArrayList<Integer>> tree = new HashMap<>();
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			ArrayList<Integer> array;
			if (tree.containsKey(a)) {
				array = tree.get(a);
			} else {
				array = new ArrayList<>();
			}
			array.add(b);
			tree.put(a,  array);
		}
		Map<Integer, ArrayList<Integer>> tree0 = new HashMap<>();
		for (int i = N/3; i <= N; i++) {
			if (!tree.containsKey(i))
				continue;
			ArrayList<Integer> array = new ArrayList<>();
			solve0(tree, i, array);
			tree0.put(i, array);
		}
		int[] value = new int[N+1];
 		Arrays.fill(value, 0);
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			value[p] += x;
			if (p <= N/3) {
				solve(tree, p ,x, value);
			} else {
				if (!tree0.containsKey(p))
					continue;
				ArrayList<Integer> array = tree0.get(p);
				if (array.isEmpty())
					continue;
				for (int j = 0; j < array.size(); j++) {
					value[array.get(j)] += x;
				}
			}
		}
		for (int i = 1; i < N; i++) {
			System.out.print(value[i] + " ");
		}
		System.out.println(value[N]);
	}
	static void solve0(Map<Integer, ArrayList<Integer>> tree, int p, ArrayList<Integer> array) {

		if (!tree.containsKey(p))
			return;

		ArrayList<Integer> leafs = tree.get(p);
		for (int i = 0; i < leafs.size(); i++) {
			array.add(leafs.get(i));
			if (tree.containsKey(leafs.get(i)))
				solve0(tree, leafs.get(i), array);
		}
	}
	static void solve(Map<Integer, ArrayList<Integer>> tree, int p, int x, int[] value) {

		if (!tree.containsKey(p))
			return;

		ArrayList<Integer> leafs = tree.get(p);
		for (int i = 0; i < leafs.size(); i++) {
			value[leafs.get(i)] += x;
			if (tree.containsKey(leafs.get(i)))
				solve(tree, leafs.get(i), x, value);
		}
	}

}