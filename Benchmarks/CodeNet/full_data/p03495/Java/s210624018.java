import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		List<Entry<Integer,Integer>> list_entries = new ArrayList<Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<Integer,Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                //降順
                return obj1.getValue().compareTo(obj2.getValue());
            }
		});
		int count = 0;
		int m = 0;
		for(int i = k; i < list_entries.size(); i++) {
			count += list_entries.get(m).getValue();
			m++;
		}
		System.out.println(count);
	}
}