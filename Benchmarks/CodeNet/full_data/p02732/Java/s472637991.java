import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int next = sc.nextInt();
			list.add(next);
			map.compute(next, (k, v) -> v == null ? 1 : v + 1);
		}
		System.out.println(map);

		list.forEach(l -> {
			int c = 0;
			for (Entry<Integer, Integer> ent : map.entrySet()) {
				if (ent.getKey() == l) {
					c += ((ent.getValue() - 1) * (ent.getValue() - 2)) / 2;
				} else {
					c += (ent.getValue() * (ent.getValue() - 1)) / 2;
				}
			}

			System.out.println(c);
		});

		sc.close();
	}

}
