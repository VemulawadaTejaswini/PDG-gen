package Abc087;

import java.util.Scanner;

/**
 * @author miyaa
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestBuyingSweets();

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int cakePrice = sc.nextInt();
		int donutPrice = sc.nextInt();

		int result = getBuyingSweetsResult(money, cakePrice, donutPrice);
		System.out.println(result);
	}

	/**
	 * @return
	 */
	public static void TestBuyingSweets() {
		System.out.println(getBuyingSweetsResult(1234, 150, 100)); // 84
		System.out.println(getBuyingSweetsResult(1000, 108, 108)); // 28
		System.out.println(getBuyingSweetsResult(579, 123, 456)); // 0
	}

	/**
	 * @param money
	 * @param cakePrice
	 * @param donutPrice
	 * @return
	 */
	public static int getBuyingSweetsResult(int money, int cakePrice, int donutPrice) {
		return (money - cakePrice) % donutPrice;
	}
}
