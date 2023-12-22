import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = (int)Math.pow(2, n);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int prev = arr[0];
		int count = 1;
		for (int i = 1; i < size; i++) {
			if (prev == arr[i]) {
				count++;
			} else {
				map.put(prev, count);
				count = 1;
			}
			prev = arr[i];
		}
		map.put(prev, count);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return i2.intValue() - i1.intValue();
		}
		});
		PriorityQueue<Integer> next = new PriorityQueue<Integer>(new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return i2.intValue() - i1.intValue();
		}
		});
		Map.Entry<Integer, Integer> en = map.lastEntry();
		if (en.getValue() != 1) {
			System.out.println("No");
			return;
		}
		queue.add(en.getKey());
		map.remove(en.getKey());
		for (int i = 0; i < n; i++) {
			while (queue.size() > 0) {
				int x = queue.poll();
				Map.Entry<Integer, Integer> entry = map.lowerEntry(x);
				if (entry == null) {
					System.out.println("No");
					return;
				}
				if (entry.getValue() == 1) {
					map.remove(entry.getKey());
				} else {
					map.put(entry.getKey(), entry.getValue() - 1);
				}
				next.add(x);
				next.add(entry.getKey());
			}
			PriorityQueue<Integer> tmp = queue;
			queue = next;
			next = tmp;
		}
		System.out.println("Yes");
	}
}
