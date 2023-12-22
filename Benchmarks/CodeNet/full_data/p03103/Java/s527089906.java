import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];

		for (int i = 0; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}
		//a(金額）の少ない順でソート
		Arrays.sort(ab, (a, b) -> Integer.compare(a[0], b[0]));

		long price = 0;
		long amount = 0;
		for (int i = 0; i < n; i++) {
			if (amount + ab[i][1] <= m) {
				price += (long)ab[i][0] * ab[i][1];
				amount += ab[i][1];
			} else {
				price += ab[i][0] * (m - amount);
				break;
			}
			//			System.out.println(price);
		}

		System.out.println(price);

		//		for (int i = 0; i < n; i++) {
		//			System.out.print(ab[i][0] + ", ");
		//			System.out.println(ab[i][1]);
		//		}

		sc.close();
	}
}