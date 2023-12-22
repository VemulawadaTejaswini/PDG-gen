import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int l = 0;
		int cnt = 1;

		for (int i = 0; i < n; i++) {
			l += scan.nextInt();

			if (l > x) {
				break;
			}
			cnt++;
		}

		System.out.println(cnt);

	}
}