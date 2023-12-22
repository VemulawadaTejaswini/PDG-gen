import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static<T> void printList(Iterable<T> a) {
		System.out.print("[");
		boolean first = true;
		for (T t : a) {
			if (first) {
				first = false;
			} else {
				System.out.print(", ");
			}
			System.out.print(t);
		}
		System.out.println("]");
	}

	public enum Event {
		Unblock, Block, Walk,
	}

	public static final class Item implements Comparable<Item> {
		public int time, X;
		public Event event;
		public Item(int time, Event event, int X) {
			this.time = time;
			this.event = event;
			this.X = X;
		}

		@Override
		public int compareTo(Item o) {
			int x = this.time - o.time;
			if (x != 0) {
				return x;
			}
			return this.event.compareTo(o.event);
		}

		@Override
		public String toString() {
			return String.format("(%d, %s, %d)", time, event, X);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 2 * 10^5
		int Q = sc.nextInt(); // 2 * 10^5

		ArrayList<Item> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt(); // 10^9
			int t = sc.nextInt(); // 10^9
			int x = sc.nextInt(); // 10^9
			list.add(new Item(s - x, Event.Block, x));
			list.add(new Item(t - x, Event.Unblock, x));
		}
		for (int i = 0; i < Q; i++) {
			int d = sc.nextInt(); // 10^9
			list.add(new Item(d, Event.Walk, i));
		}
		Collections.sort(list);
		// printList(list);
		int[] answers = new int[Q];
		TreeSet<Integer> blocks = new TreeSet<Integer>();

		for (Item item : list) {
			if (item.event == Event.Block) {
				blocks.add(item.X);
			}
			if (item.event == Event.Unblock) {
				blocks.remove(item.X);
			}
			if (item.event == Event.Walk) {
				// printList(blocks);
				answers[item.X] = blocks.isEmpty() ? - 1 : blocks.first();
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int x : answers) {
			sb.append(x);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
