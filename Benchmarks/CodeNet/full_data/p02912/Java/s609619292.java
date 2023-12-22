import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, m;

		String[] nm = scanner.nextLine().split(" ");
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);
		String[] as = scanner.nextLine().split(" ");
		ArrayList<Price> prices = new ArrayList<Price>();
		for (int i = 0; i < n; i++) {
			Price price = new Price();
			price.div = 0;
			price.price = Integer.parseInt(as[i]);
			prices.add(price);
		}

		for (int i = 0; i < m; i++) {

			prices.sort((a, b) -> (int) (
					(
							(double) a.price / Math.pow(2, (double) a.div)
					- (double) b.price / Math.pow(2, (double) b.div)
					) * 10
					)); /* ラムダ式 */
			prices.get(n - 1).div = prices.get(n - 1).div + 1;
		}

		scanner.close();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += prices.get(i).price / Math.pow(2, prices.get(i).div);
		}
		System.out.println(sum);
	}

	static class Price {
		int price;
		int div;
	}
}