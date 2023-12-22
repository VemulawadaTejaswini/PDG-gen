import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		final int x1 = sc.nextInt();
		final int y1 = sc.nextInt();
		final int x2 = sc.nextInt();
		final int y2 = sc.nextInt();

		final int xabs = x1 > x2 && y1 < y2 ? Math.abs(x2 - x1) * -1 : Math.abs(x2 - x1);
		final int yabs = Math.abs(y2 - y1);

		final int x3 = x2 - yabs;
		final int y3 = y2 + xabs;
		final int x4 = x1 - yabs;
		final int y4 = y1 + xabs;

		System.out.println(
				String.valueOf(x3) + " " + String.valueOf(y3) + " " + String.valueOf(x4) + " " + String.valueOf(y4));
	}

}
