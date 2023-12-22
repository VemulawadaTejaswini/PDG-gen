import java.util.*;

public class Main {

	static class Item implements Comparable<Item> {
		public int cost;
		public int id;

		public Item(int id, int cost) {
			this.id = id;
			this.cost = cost;
		}

		@Override
		public int compareTo(Item that) {
			return this.cost - that.cost;
		}
	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static void fill(int color, int[] C, int i, ArrayList<Item>[] edge) {
		C[i] = color;
		if (edge[i] != null) {
			for (Item item : edge[i]) {
				if (C[item.id] == 0) {
					fill(color, C, item.id, edge);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Item>[] edge = new ArrayList[N + 1];
		for (int i = 0; i < M; i++) {
			int src = sc.nextInt();
			int dst = sc.nextInt();
			int cost = sc.nextInt() % 2 + 2;
			if (edge[src] == null) {
				edge[src] = new ArrayList<Item>();
			}
			edge[src].add(new Item(dst, cost));
			if (edge[dst] == null) {
				edge[dst] = new ArrayList<Item>();
			}
			edge[dst].add(new Item(src, cost));
		}

		int color = 0;
		int[] C = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			if (C[i] == 0) {
				fill(++color, C, i, edge);
			}
		}
		System.out.println(color);
	}
}
