import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int result = 0;

		if (n >= k) {
			result += x * k + y * (n - k);
		} else {
			result += x * n;
		}
		System.out.println(result);
		sc.close();
	}
}
