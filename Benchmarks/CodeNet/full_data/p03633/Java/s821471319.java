import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long ans = Long.parseLong(sc.nextLine());
		Main main = new Main();
		for (int i = 0; i < n - 1; i++) {
			long let = Long.parseLong(sc.nextLine());
			ans =ans / main.GCD(ans, let) * let;
		}
		System.out.println(ans);
		sc.close();
	}

	public long GCD(long num1, long num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return GCD(num2, num1 % num2);
		}
	}
}