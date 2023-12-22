import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		if (H % 2 == 0) {
			System.out.println((H / 2) * W);
		} else {
			System.out.println((H / 2) * W + W / 2 + 1);
		}
	}
}