import java.util.Scanner;

public class Main {

	static boolean[][]  cards;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmpx = sc.nextInt();
		int tmpy = sc.nextInt();
		long cnt = 0;

		int x, y;

		// 横長にする
		if (tmpx < tmpy) {
			x = tmpy;
			y = tmpx;
		} else {
			x = tmpx;
			y = tmpy;
		}

		// 1st,Last Rowsで表の枚数
		int count1st = 0;
		if(x == 1) {
			count1st = 1;
		} else if (y == 1) {
			if (x == 1) {
				count1st = 1;
			} else {
				count1st = x - 2;
			}
		} else {
			count1st = 0;
		}

		int countElse = 0;
		if (x == 1) {
			// 該当行無し
			countElse = 0;
		} else if (x == 2) {
			countElse = 2;
		} else {
			countElse = x - 2;
		}

		if (y == 1) {
			cnt = count1st;
		} else {
			cnt = count1st * 2 + countElse * (y - 2);
		}

		System.out.println(cnt);
		sc.close();
	}
}