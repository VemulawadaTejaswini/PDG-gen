import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int b2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int b3 = scanner.nextInt();

		int[] number = new int[4];
		number[a1 - 1]++;
		number[b1 - 1]++;
		number[a2 - 1]++;
		number[b2 - 1]++;
		number[a3 - 1]++;
		number[b3 - 1]++;

		int count = 0;
		for (int x : number) {
			if (x > 2 || x == 0) {
				System.out.println("NO");
				return;
			}

			if (x == 2) {
				if (++count == 3) {
					System.out.println("NO");
					return;
				}
			}
		}
		if (count == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}