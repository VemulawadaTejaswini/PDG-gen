import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long ans = 0;

		long num = 1;
		while (true) {

			if ((n - num) / num <= num) {
				break;
			}

			if ((n - num) % num == 0) {
				ans += (n - num) / num;
			}
			num++;

		}

		System.out.println(ans);

		sc.close();
	}

}