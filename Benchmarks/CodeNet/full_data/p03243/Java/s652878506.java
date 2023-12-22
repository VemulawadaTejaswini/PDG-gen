
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, ans = 111;

		n = sc.nextInt();

		for (int i = 1; i < 10; ++i) {
			int tmp = i * 100 + i * 10 + i;
			if (n <= tmp) {
				ans = tmp;
				break;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
