import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Set<Integer> isRed = new HashSet<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			map.put(a, sc.nextInt());
			isRed.add(a);
		}
		for(int i = 0; i < n; i++) {
			map.put(sc.nextInt(), sc.nextInt());
		}
		TreeSet<Integer> redyset = new TreeSet<>();
		int ans = 0;
		for(Integer x : map.keySet()) {
			if(isRed.contains(x)) {
				redyset.add(map.get(x));
			} else {
				int y = map.get(x);
				if(!redyset.isEmpty() && redyset.first() < y) {
					redyset.pollFirst();
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}