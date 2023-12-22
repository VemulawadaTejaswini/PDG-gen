import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var a = new SortedList();
		for (var i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		sc.close();

		for (var i = 0; i < m; i++) {
			var av = a.get(n -1);
			a.remove(n -1);
			a.add(av / 2);
		}

		var sum = 0L;
		for (var i = 0; i < n; i++) {
			sum += a.get(i);
		}
		System.out.println(sum);
	}

	public static class SortedList {
		List<Integer> list;

		public SortedList() {
			this.list = new ArrayList<Integer>();
		}

		public SortedList(List<Integer> list) {
			this.list = list;
		}

		public int get(int index) {
			return list.get(index);
		}

		public void add(int value) {
			list.add(search(value), value);
		}

		public int remove(int index) {
			return list.remove(index);
		}

		private int search(int value) {
			var min = 0;
			var max = list.size();
			while (max - min > 1) {
				var mid = min + (max - min) / 2;
				if (list.get(mid) <= value) {
					min = mid;
				} else {
					max = mid;
				}
			}

			if (max - min == 1 && list.get(min) <= value) {
				min++;
			}
			return min;
		}
	}
}
