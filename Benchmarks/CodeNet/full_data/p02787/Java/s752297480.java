import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list1.add(scan.nextInt());
			list2.add(scan.nextInt());
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		int current = 1;
		int result = Integer.MAX_VALUE;
		while (current <= h + Collections.max(list1)) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int a = list1.get(i);
				int b = list2.get(i);
				int key = current - a;
				if (map.containsKey(key)) {
					min = Math.min(map.get(key) + b, min);
				}
			}

			if (min < Integer.MAX_VALUE) {
				map.put(current, min);
				if (current >= h) {
					result = Math.min(min, result);
				}
			}

			current++;
		}

		System.out.println(result);
		scan.close();
	}
}