import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0, l1 = 1, l2 = 2;
		if (n == 1) {
			ans = 1;
		} else {
			for (int i = 2; i <= n; i++) {
				ans = l1 + l2;
				l2 = l1;
				l1 = ans;
			}
		}
		System.out.println(ans);
	}

}