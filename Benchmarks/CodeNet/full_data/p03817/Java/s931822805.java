import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		Long x = Long.decode(sc.next());
		long ans = 1;

		while (x > 110000) {
			x = x - 110000;
			ans += 20000;
		}

		for (int i = 0; x > 0; i++) {
			if (x <= 6) {
				ans += 1;
				break;
			} else if (i % 2 == 0) {
				x = x - 6;
				ans++;
			} else {
				x = x - 5;
				ans++;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
