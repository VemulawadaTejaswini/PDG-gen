import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m=scanner.nextInt();
		int p[]=new int[m];
		int y[]=new int[m];
		Map<Integer,Set<Integer>>map=new TreeMap<>();
		for(int i=0;i<m;i++) {
			p[i]=scanner.nextInt();
			y[i]=scanner.nextInt();
			if (map.containsKey(p[i])) {
				map.get(p[i]).add(y[i]);
				//Collections.sort(map.get(p[i]));
			} else {
				Set<Integer>set=new TreeSet<>();
				set.add(y[i]);
				map.put(p[i], set);
			}
		}
		/*for(List<Integer> list:map.values()) {
			Collections.sort(list);
		}*/
		for(int i=0;i<m;i++) {
			List<Integer> list = new ArrayList<Integer>(map.get(p[i]));
			int ind=lower_bound(list, y[i])+2;
			System.out.printf("%06d", p[i]);
			System.out.printf("%06d", ind);
			System.out.println("");
			
		}
	}
	private static int lower_bound(List<Integer> list, int val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1) - 1;
	}
}
