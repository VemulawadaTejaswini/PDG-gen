import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		ArrayList<Long> dup = new ArrayList<Long>();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			long key = reader.nextLong();
			int val = 1;
			if (map.containsKey(key)) {
				val = map.get(key) + 1;
			}
			map.put(key, val);
			if (val % 2 == 0) {
				dup.add(key);
			}
		}
		Collections.reverse(dup);
		if (dup.size() > 1) {
			ans = dup.get(0) * dup.get(1);
		}
		System.out.println(ans);
		reader.close();
	}


}



