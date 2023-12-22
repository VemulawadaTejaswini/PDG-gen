import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		Set<String> array = new TreeSet<>();

		sc.nextLine();
		Map stores = new TreeMap<>();
		for (int i = 1; i <= count; i++) {
			String str = sc.next();
			int point = sc.nextInt();
			if (stores.containsKey(str)) {
				Map<Integer, List> bbb = (TreeMap) stores.get(str);
				if (bbb.containsKey(point)) {
					List list = (List) bbb.get(point);
					list.add(i);
					bbb.put(point, list);
				} else {
					List<Integer> list = new ArrayList<>();
					list.add(i);
					bbb.put(point, list);
				}
				stores.put(str, bbb);
			} else {
				Map<Integer, List> ddd = new TreeMap<>(Collections.reverseOrder());
				List<Integer> list = new ArrayList<>();
				list.add(i);
				ddd.put(point, list);
				stores.put(str, ddd);
			}
			sc.nextLine();
		}
		for (Object map : stores.values()) {
			Map mp = (Map) map;
			for (Object list : mp.values()) {
				List lst = (List) list;
				for (Object obj : lst) {
					System.out.println(obj);
				}
			}
		}
	}
}