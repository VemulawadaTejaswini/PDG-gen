import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < n; i++) {
			int key = scanner.nextInt();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		map=MapValueSort (map, 0);
		
		int ans = 0;
		int size = map.size();
		for (int tar : map.keySet()) {
			if (size <= k) {
				System.out.println(ans);
				return;
			}
			ans += map.get(tar);
			size--;
		}

	}
	
	static Map<Integer,Integer> MapValueSort (Map<Integer,Integer> map, int n) {
		List<Integer> list = new ArrayList<>(map.values());
		List<Integer> list2 = new ArrayList<>();
		Map<Integer,Integer> map2 = new LinkedHashMap<>();
		if (n==0) {Collections.sort(list);}
		else if (n==1) {Collections.sort(list,Comparator.reverseOrder());}
		for (int i=0; i<list.size(); i++) {
			for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
				if (list.get(i)==entry.getValue() && list2.contains(entry.getKey())==false) {
					map2.put(entry.getKey(),entry.getValue());
					list2.add(entry.getKey());
					break;
				}
			}
		}
		return map2;
	}
}
