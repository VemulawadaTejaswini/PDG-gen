import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int dx = n > k ? k : n;
		int dy = n > k ? n - k : 0;

		int fee = dx * x + dy * y;
		System.out.println(fee);
		sc.close();
	}
}
