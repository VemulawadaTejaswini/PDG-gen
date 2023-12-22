import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] t  = sc.nextLine().split(" ");
		int n       = Integer.parseInt(t[0]);
		int m       = Integer.parseInt(t[1]);
		int a;
		String b;
		boolean[] x = new boolean[n];
		Arrays.fill(x, false);
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < m; i++) {

			a = sc.nextInt() - 1;
			b = sc.next();
			if(!x[a]) {
				if(b.equals("WA")) {
					if(map.containsKey(a)) {
						map.put(a, map.get(a) + 1);
					}else {
						map.put(a, 1);
					}
				}else {
					x[a] = true;
				}
			}
		}
		int c = 0;
		int d = 0;

		for(boolean q : x) {
			if(q)c++;
		}
		for(Entry<Integer, Integer> w : map.entrySet()) {
			if(x[w.getKey()]) {
				d += w.getValue();
			}
		}

		System.out.println(c + " " + d);
	}
}