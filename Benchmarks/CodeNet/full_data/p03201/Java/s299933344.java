
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		TreeMap<Integer, Integer>map = new TreeMap<>();
		
		int tmp = 0;
		
		for (int i=0;i<n;i++) {
			int x = sc.nextInt();
			if (!map.containsKey(x)) {
				map.put(x, 0);
			}
			tmp = map.get(x);
			map.put(x, tmp+1);
		}
		int count = 0;
		while(!map.isEmpty()) {
			int a = map.lastKey();
			int b =Integer.highestOneBit(a)*2-a;
			if (map.containsKey(b) && a!=b) {
				count++;
				
				tmp = map.get(a);
				if (tmp>1) {
					map.put(a, tmp-1);
				} else {
					map.remove(a);
				}
				
				tmp = map.get(b);
				if (tmp>1) {
					map.put(b, tmp-1);
				} else {
					map.remove(b);
				}
			} else if (map.containsKey(b) && a==b) {
				tmp = map.get(a);
				if (tmp>=2) {
					count++;
				}
				
				if (tmp>2) {
					map.put(a, tmp-2);
				} else {
					map.remove(a);
				}
				
			} else {
				map.remove(a);
			}
		}
		System.out.println(count);
	}
}
