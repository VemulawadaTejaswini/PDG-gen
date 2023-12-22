import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int x = Integer.parseInt(S.substring(0, 2));
		int y = Integer.parseInt(S.substring(2, 4));

		int xFlg = 0;
		int yFlg = 0;

		if (1 <= x && x <= 12) {
			xFlg = 1;
		} else if (y != 0) {
			xFlg = 2;
		}

		if (1 <= y && y <= 12) {
			yFlg = 1;
		} else if (y != 0) {
			yFlg = 2;
		}

		if (xFlg == 0 || yFlg == 0 || (xFlg == 2 && yFlg == 2)) {
			System.out.println("NA");
		} else if (xFlg == 1 && yFlg == 1) {
			System.out.println("AMBIGUOUS");
		} else if (xFlg == 1) {
			System.out.println("MMYY");
		} else {
			System.out.println("YYMM");
		}
	}
}
