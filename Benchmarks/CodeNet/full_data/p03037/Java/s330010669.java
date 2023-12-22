import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		int[] l = new int[m];
		int[] r = new int[n];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			for (int j = l[i]; j <= r[i]; j++) {
				if (map.containsKey(j)) {
					map.put(j, map.get(j)+ 1);
				} else {
					map.put(j, 1);
				}
			}
		}
		int count = 0;
		for (int i : map.keySet()) {
			if (map.get(i) == m) {
				count++;
			}
		}
		System.out.println(count);
	}
}
