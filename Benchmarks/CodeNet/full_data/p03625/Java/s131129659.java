import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Long, Long> map = new TreeMap<>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			long a = scan.nextLong();
			if (!map.containsKey(a)) {
				map.put(a, Long.valueOf(1));
			} else {
				long temp = map.get(a);
				map.put(a, temp + 1);
			}
		}
		long sq = 1;
		int count = 0;
		int len = map.size();
		for (int i = 0; i < len; i++) {
			Entry<Long, Long> ans = map.pollLastEntry();
			long tempV = ans.getValue();
			long tempK = ans.getKey();
			for (int j = 0; j < 2; j++) {
				if (tempV >= 2) {
					tempV = tempV - 2;
					sq = sq * tempK;
					count++;
				}
			}
		}
		if (count < 2) {
			System.out.println(0);
		} else {
			System.out.println(sq);
		}

	}
}