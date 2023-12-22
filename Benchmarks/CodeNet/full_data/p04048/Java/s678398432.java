import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int a = x;
		int b = n - x;
		int sum = n;

		while (true) {

			if (b % a == 0) {
				for (int i = 0; i < b / a; i++) {
					sum += 2 * a;
				}
				sum = sum - a;
				break;
			}else {
				for (int i = 0; i < b / a; i++) {
					sum += 2 * a;
				}
				int num = a;
				a = b % a;
				b = num;
			}
		}

		System.out.println(sum);
		scan.close();
	}

}
