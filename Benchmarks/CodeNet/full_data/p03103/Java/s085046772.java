import java.util.Scanner;
import java.util.TreeMap;

public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner (System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		TreeMap <Long,Long> costAmount = new TreeMap <Long,Long>();

		for (int index=0; index<N; index++) {
			Long cost = scanner.nextLong();
			Long amount = scanner.nextLong();

			if (costAmount.containsKey(cost)) {
				costAmount.put(cost, costAmount.get(cost)+amount);
			} else {
				costAmount.put(cost, amount);
			}
		}

		Long nowAmount = 0l;
		Long money = 0l;

		for (Long nKey : costAmount.keySet()) {

			Long amount = costAmount.get(nKey);
			Long cost = nKey;

			if (M-nowAmount>amount) {
				nowAmount+=amount;
				money+=(amount*cost);
			} else {
				money+=(M-nowAmount)*cost;
				break;
			}

		}

		System.out.println(money);
	}
}