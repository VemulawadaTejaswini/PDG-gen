import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Long, Long> drinkMap = new HashMap<Long, Long>();

		for (int i = 0; i < N; i++) {
			drinkMap.put(sc.nextLong(), sc.nextLong());
		}

		List<Long> keys = new ArrayList<Long>(drinkMap.keySet());

		Collections.sort(keys);

		long amtSum = 0;
		for (Long amt : keys) {
			long itemCount = drinkMap.get(amt);
			if(itemCount >= M) {
				amtSum += amt * M;
				break;
			} else {
				amtSum += amt * itemCount;
				M -= itemCount;
			}

			if (M <= 0) {
				break;
			}
		}

		System.out.println(amtSum);

	}

}