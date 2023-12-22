import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long ans = 0;
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		ArrayList<Long> prices = new ArrayList<Long>();

		long max = 0;
		for (int i = 0; i < N; i++) {
			Long price = scanner.nextLong();
			prices.add(price);
		}

		for (int i = 0; i < M; i++) {
			int indexs = prices.indexOf(Collections.max(prices));
			prices.set(indexs, prices.get(indexs) / 2);
		}
		for (long price : prices) {
			ans += price;
		}
		System.out.println(ans);
	}
}
