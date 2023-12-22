import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

		ArrayList <Long> drinkList = new ArrayList <Long>();
		HashMap <Long,Long> costAmount = new HashMap <Long,Long>();

		for (int index=0; index<N; index++) {
			Long cost = scanner.nextLong();
			Long amount = scanner.nextLong();

			if (Arrays.asList(drinkList).contains(cost)) {
				Long tempAmount = costAmount.get(cost);
				Long newAmount = amount+tempAmount;
				costAmount.remove(cost);
				costAmount.put(cost,newAmount);
			} else {
				drinkList.add(cost);
				costAmount.put(cost, amount);
			}
		}

		Long nowAmount = 0l;
		Long money = 0l;

		Collections.sort(drinkList);
		
		for (int index=0;; index++) {
			if (M-nowAmount>costAmount.get(drinkList.get(index))) {
				nowAmount+=costAmount.get(drinkList.get(index));
				money+=(costAmount.get(drinkList.get(index))*drinkList.get(index));
			} else {
				money+=(M-nowAmount)*drinkList.get(index);
				break;
			}
		}

		System.out.println(money);
	}
}