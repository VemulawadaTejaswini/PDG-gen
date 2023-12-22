import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = calcSumofDigits(n);
		int tot = 0;
		if (a <= ans && ans >= b) {
			tot += ans;
		}
		System.out.println(tot);

	}
	static int calcSumofDigits(int n) {
		int ans = 0;
		while (n > 0) {
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}
}
