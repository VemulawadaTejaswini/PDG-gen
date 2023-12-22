import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Long, Long> map = new TreeMap<>();
		// 件数
		long N = scan.nextInt();
		// 本数
		long M = scan.nextInt();

		Long tempKey;
		Long tempVal;
		for (int i = 0; i < N; i++) {
			tempKey = scan.nextLong();
			tempVal = scan.nextLong();
			if (map.containsKey(tempKey)) {
				map.put(tempKey, map.get(tempKey) + tempVal);
			} else {
				map.put(tempKey, tempVal);
			}
		}

		long ans = 0;
		Entry<Long, Long> tempMap;
		while (map.size() != 0) {
			tempMap = map.pollFirstEntry();
			tempKey = tempMap.getKey();
			tempVal = tempMap.getValue();
			if (M > tempVal) {
				M = M - tempVal;
				ans = ans + (tempVal * tempKey);
			} else {
				ans = ans + (M * tempKey);
				break;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}