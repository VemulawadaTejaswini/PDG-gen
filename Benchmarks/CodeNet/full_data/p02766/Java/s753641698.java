import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int n = 0;

		int count = 0;
		for (;;) {
			n = n1 / n2;
			n1 = n;
			if (n1 < n2) {
				break;
			}
			count++;
		}
		System.out.println(count + 2);

	}
}
