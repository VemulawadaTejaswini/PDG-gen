import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int ans = 0;
		if (B / A > C) {
			ans = C;
		} else {
			ans = B / A;
		}
		System.out.println(ans);
	}
}