import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();

		int total = 0;

		if ((h & 1) == 0) {
			if (a > 0 && b > 0 && h > 0 && a < 100 && b < 100 && h < 100) {
				total = (a + b) * h / 2;
			}
			if (total > 0) {
				System.out.println(total);
			}
		} else {
			System.err.println("");
		}
	}

}