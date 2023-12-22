import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();


		int nums[] = new int[n];

		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(sc2.next());
		}
		int count = 0;

		while (true) {

			boolean flg = false;

			for (int i = 0; i < n; i++) {
				if (nums[i] % 2 == 0) {
					flg = true;
					nums[i] = nums[i]/2;
				} else {
					flg = false;
					break;
				}
			}

			if (flg) {
				count++;

				continue;
			} else {
				break;
			}
		}

		System.out.println(count);

	}
}
