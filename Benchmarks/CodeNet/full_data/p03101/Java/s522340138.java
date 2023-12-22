import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		sc.close();

		int ans = 0;

		ans = H*W - (H*w) - (h * (W-w));
		System.out.println(ans);

	}
}
