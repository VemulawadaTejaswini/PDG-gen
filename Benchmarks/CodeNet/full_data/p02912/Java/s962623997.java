import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long ans = 0;
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int ticket = 0;
		ArrayList<Long> prices = new ArrayList<Long>();

		long max = 0;
		for (int i = 0; i < N; i++) {
			Long price = scanner.nextLong();
			if (max < price)
				max = price;
			prices.add(price);
		}

		int index = prices.indexOf(max);
		prices.set(index, prices.get(index) / 2);
		ticket++;

		while (true) {
			if (ticket == M)
				break;
			Collections.sort(prices);
			prices.set(0, prices.get(0) / 2);
			ticket++;
		}

		for (long price : prices) {
			ans += price;
		}
		System.out.println(ans);
	}
}
