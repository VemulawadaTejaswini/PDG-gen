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
		long k = sc.nextLong();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		Map<Long, Long> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + b[i]);
			} else {
				map.put(a[i], b[i]);
			}
		}
		List<Entry<Long, Long>> q = new ArrayList<>(map.entrySet());
		Collections.sort(q, new Comparator<Entry<Long, Long>>() {
			public int compare(Entry<Long, Long> obj1, Entry<Long, Long> obj2) {
				return (int)(obj1.getKey() - obj2.getKey());
			}
		});
		for(int i = 0 ; i < q.size() ; i++) {
			k -= q.get(i).getValue();
			if(k <= 0) {
				System.out.println(q.get(i).getKey());
				return;
			}
		}
	}
}
