import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;

		if (Math.abs(a-b) > W) {
			ans = Math.abs(a-b) - W;
		} else {
			ans = 0;
		}
		System.out.println( ans );
	}
}
