import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		System.out.println("まず、入力回数を指定してください。");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		System.out.println("時間、xの位置、yの位置を空白区切りで回数分指定してください。");

		int[] before = {0, 0, 0};
		boolean judge = true;
		for (int i=0; i<count; i++) {
			boolean temp = check(scan, before);
			if (judge) {
				judge = temp;
			}
		}

		if (judge) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	protected static boolean check(Scanner scan, int[] before) {
		int t = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();

		int dif = Math.abs(x - before[1] + y - before[2]);
		int before_bak = before[0];
		before[0] = t;
		before[1] = x;
		before[2] = y;

		t = t - before_bak;
		while(t > 0) {
			if (dif == t) {
				return true;
			}
			t -= 2;
		}
		return false;
	}
}
