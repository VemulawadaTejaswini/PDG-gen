import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int heightBorder = 0;
		int count = 0;

		// 数の入力
		num = scan.nextInt();
		heightBorder = scan.nextInt();
		for (int i = 0; i < num; i++) {
			if (scan.nextInt() >= heightBorder) {
				count++;
			}
		}

		System.out.println(count);
	}
}
