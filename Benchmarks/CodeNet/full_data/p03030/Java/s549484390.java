import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, List<Integer>> map = new TreeMap<>();
		List<Integer> order = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			int p = scanner.nextInt();
			order.add(p);
			if (map.containsKey(s)) {
				map.get(s).add(p);
			} else {
				List<Integer> set = new ArrayList<>();
				set.add(p);
				map.put(s, set);
			}
		}
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		for (List<Integer> value : map.values()) {
			value.sort(comparator);
			for (Integer price : value) {
				System.out.println(order.indexOf(price) + 1);
			}
		}
	}
}
