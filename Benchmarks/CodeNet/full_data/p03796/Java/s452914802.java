import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = (ans * i) % 1000000007;
		}
		System.out.println(ans);
	}
}