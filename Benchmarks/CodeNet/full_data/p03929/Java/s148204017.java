import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int k = num.nextInt();
		int ans = 0;
		int ans1 = 0;
		int ans2 = 0;
		int chk = 0;
		int chk1 = 0;

		if (n <= 2) {
			System.out.println("0");
			return;
		}
		for (int i = 2; i <= 6; i++) {
			chk = (i * 3 + 21) * 3;
			
			for (int x = 1; x <= 11; x++) {
				chk1 = chk % 11;
				if (chk1 == k) {
					ans1 = n / 11;
					ans2 = n % 11 - 2;
					if (ans2 >= x) {
						ans1 = ans1 + 1;
					}
					ans = ans + ans1;
				}
			chk = chk + 63;
			}
		}
		System.out.println(ans);
		num.close();
	}
}
