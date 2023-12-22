import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力受付
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		for (int i = 1; i <= n; i++) {
			if (i != n) {
				System.out.print(list.indexOf(i) + 1);
				System.out.print(" ");
			} else {
				System.out.print(list.indexOf(i) + 1);
			}

		}

	}
}
