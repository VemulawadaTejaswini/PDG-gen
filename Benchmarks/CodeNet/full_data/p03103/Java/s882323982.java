import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner (System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		HashMap <Long,Long> costAmount = new HashMap <Long,Long>();

		for (int index=0; index<N; index++) {
			Long cost = scanner.nextLong();
			Long amount = scanner.nextLong();

			costAmount.put(cost, amount);
		}

		Long nowAmount = 0l;
		Long money = 0l;

		Object[] mapkey = costAmount.keySet().toArray();
		Arrays.sort(mapkey);

		for (Long nKey : costAmount.keySet()) {

			Long cost = costAmount.get(nKey);

			if (M-nowAmount>costAmount.get(cost)) {
				nowAmount+=costAmount.get(cost);
				money+=(costAmount.get(cost)*cost);
			} else {
				money+=(M-nowAmount)*cost;
				break;
			}

		}

		System.out.println(money);
	}
}