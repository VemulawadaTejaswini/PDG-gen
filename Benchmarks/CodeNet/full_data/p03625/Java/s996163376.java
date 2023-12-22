
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n; i++) a[i] = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		List<Entry<Integer, Integer>> entry = new ArrayList<>(map.entrySet());
		Collections.sort(entry, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj1.getValue() - obj2.getValue();
			}
		});
		if(entry.get(0).getValue() >= 2 && entry.get(1).getValue() >= 2) {
			System.out.println(entry.get(0).getKey() * entry.get(1).getKey());
		} else {
			System.out.println(0);
		}
	}
}