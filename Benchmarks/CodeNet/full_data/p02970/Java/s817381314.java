import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int ans = (int) Math.ceil((double) n / (2 * d + 1));

		System.out.println(ans);
		sc.close();
	}
}