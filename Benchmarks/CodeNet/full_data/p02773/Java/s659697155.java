
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		int max = 0;
		for (Integer i : map.values()) {
			max = Math.max(max, i);
		}
		
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() == max) {
				list.add(e.getKey());
			}
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
	}
}


