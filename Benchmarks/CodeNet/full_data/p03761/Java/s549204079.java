import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Map<String, Integer>> ary = new ArrayList<Map<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 0; j < str.length(); j++) {
				if (map.containsKey(String.valueOf(str.charAt(j)))) {
					map.put(String.valueOf(str.charAt(j)), map.get(String.valueOf(str.charAt(i))) + 1);
				} else {
					map.put(String.valueOf(str.charAt(j)), 1);
				}
			}
			ary.add(map);
		}
		Map<String, Integer> map = ary.get(0);
		Map<String, Integer> linkedMap = new LinkedHashMap<String, Integer>();
		for (int i = 1; i < ary.size(); i++) {
			Map<String, Integer> tmpmap = ary.get(i);
			Iterator<Map.Entry<String, Integer>> itr2 = tmpmap.entrySet().iterator();
			ArrayList<String> str = new ArrayList<String>();
			while (itr2.hasNext()) {
				Map.Entry<String, Integer> entry = itr2.next();
				if (i == 1) {
					if (map.containsKey(entry.getKey())) {
						linkedMap.put(entry.getKey(),
								Math.min(entry.getValue(), map.get(entry.getKey())));
						str.add(entry.getKey());
					}
				} else {
					if (linkedMap.containsKey(entry.getKey())) {
						linkedMap.put(entry.getKey(),
								Math.min(entry.getValue(), linkedMap.get(entry.getKey())));
						str.add(entry.getKey());
					}
				}

			}
			Iterator<Map.Entry<String, Integer>> itr9 = linkedMap.entrySet().iterator();
			while (itr9.hasNext()) {
				Map.Entry<String, Integer> entry = itr9.next();
				if (!str.contains(entry.getKey())) {
					linkedMap.remove(entry.getKey());
				}
			}
		}
		linkedMap.entrySet().stream().sorted(Entry.comparingByKey());
		Iterator<Map.Entry<String, Integer>> itr3 = linkedMap.entrySet().iterator();
		while (itr3.hasNext()) {
			// nextを使用して値を取得する
			Map.Entry<String, Integer> entry = itr3.next();
			String str = entry.getKey();
			int i = entry.getValue();
			for (int j = 0; j < i; j++) {
				System.out.print(str);
			}
		}
		if (linkedMap.size() == 0) {
			System.out.print("");
		}
	}

}