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

		Long[] drinkList = new Long [N];
		HashMap <Long,Long> costAmount = new HashMap <Long,Long>();

		int listIndex = 0;
		for (int index=0; index<N; index++) {
			Long cost = scanner.nextLong();
			Long amount = scanner.nextLong();

			if (Arrays.asList(drinkList).contains(cost)) {
				Long tempAmount = costAmount.get(cost);
				Long newAmount = amount+tempAmount;
				costAmount.remove(cost);
				costAmount.put(cost,newAmount);
			} else {
				drinkList[listIndex] = cost;
				costAmount.put(cost, amount);
				listIndex++;
			}
		}

		Long nowAmount = 0l;
		Long money = 0l;

		Arrays.sort(drinkList);
		for (int index=0; index<M; index++) {
			if (M-nowAmount>costAmount.get(drinkList[index])) {
				nowAmount+=costAmount.get(drinkList[index]);
				money+=(costAmount.get(drinkList[index]))*drinkList[index];
			} else {
				money+=(M-nowAmount)*drinkList[index];
				break;
			}
		}

		System.out.println(money);
	}
}