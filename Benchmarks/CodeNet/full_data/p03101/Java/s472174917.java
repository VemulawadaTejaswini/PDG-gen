import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int H = sc.nextInt();
		final int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int ans = (H - h) * (W - w);

		System.out.println(ans);

		sc.close();
	}
}
