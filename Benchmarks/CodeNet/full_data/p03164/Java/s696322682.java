import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int noOfItems = in.nextInt();
		long W = in.nextLong();
		Item[] items = new Item[noOfItems];

		for (int k = 0; k < noOfItems; k++) {
			items[k] = new Item(in.nextLong(), in.nextInt());
		}

		int pSum = 0;
		for (Item x : items) {
			pSum += x.price;
		}
		
		Long[] dp = new Long[pSum + 1];
		for (int k = 0; k <= pSum; k++) {
			dp[k] = Long.MAX_VALUE;
		}
		dp[0] = 0L;

		for (int i = 0; i < items.length; i++) {
			for (int j = pSum; j >= items[i].price; j--) {
				if (dp[j - items[i].price] != Long.MAX_VALUE) {
					dp[j] = Math.min(dp[j], items[i].weight + dp[j - items[i].price]);
				}

			}
		}
		int ans = 0;
		for (int k = 0; k <= pSum; k++) {
			if (dp[k] <= W) {
				ans = Math.max(ans, k);
			}

		}
		System.out.println(ans);
	}

	static class Item {
		Long weight;
		int price;

		public Item(Long w, int p) {
			this.weight = w;
			this.price = p;
		}

	}
}
