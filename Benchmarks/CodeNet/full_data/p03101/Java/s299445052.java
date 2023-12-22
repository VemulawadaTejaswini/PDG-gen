import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int ans = (H - h) * (W - w);
		System.out.println(ans);
		scanner.close();
	}
}