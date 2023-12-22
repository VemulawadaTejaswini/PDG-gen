import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		// num of way
		int N = Integer.parseInt(a[0]);
		// limit
		int T = Integer.parseInt(a[1]);

		Map<Integer, Integer> map = new HashMap<>();
		//ways
		for (int i = 0; i < N; i++) {
			String[] tmp = sc.nextLine().split(" ");
			map.put(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]));
		}

		ArrayList<Integer> b = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() <= T) {
				b.add(entry.getKey());
			}
		}
		Collections.sort(b);

		if (b.isEmpty()) {
			System.out.println("TLE");
		} else {
			System.out.println(b.get(0));
		}

		sc.close();
	}
}