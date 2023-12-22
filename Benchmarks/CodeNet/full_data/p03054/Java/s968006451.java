import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		// 整数の入力
		// 整数の入力
		int h = sca.nextInt();
		int w = sca.nextInt();
		int n = sca.nextInt();
		int sr = sca.nextInt();
		int sc = sca.nextInt();
		String s = sca.next();
		String t = sca.next();
		String[] sArray = s.split("");
		String[] tArray = t.split("");

		int remainLeft = sr;
		int remainRight = w - sr + 1;
		int remainUp = sc;
		int remainDown = h - sc + 1;
		boolean isRemain = true;

		for (int i = 0; i < n; i++) {
			String takahashi = sArray[i];
			String aoki = tArray[i];
			// System.out.println("takahashi " + takahashi);
			// System.out.println("aoki " + aoki);
			// left
			if (takahashi.equals("L")) {
				remainLeft--;
				remainRight++;
			}
			if (remainLeft == 0) {
				isRemain = false;
				
				// System.out.println("break by remainLeft ");
				break;
			}
			if (aoki.equals("R")) {
				if (remainRight > 1) {
					remainLeft++;
					remainRight--;
				}
			}

			// up
			if (takahashi.equals("U")) {
				remainUp--;
				remainDown++;
			}
			if (remainUp == 0) {
				isRemain = false;
				// System.out.println("break by remainUp ");
				break;
			}
			if (aoki.equals("D")) {
				if (remainDown > 1) {
					remainUp++;
					remainDown--;
				}
			}

			// System.out.println("remainLeft " + remainLeft);
			// System.out.println("remainUp " + remainUp);
			// System.out.println("remainDown " + remainDown);
			// System.out.println("remainRight " + remainRight);
			// System.out.println();
		}

		remainLeft = sr;
		remainRight = w - sr + 1;
		remainUp = sc;
		remainDown = h - sc + 1;

		for (int i = 0; i < n; i++) {
			if (!isRemain) {
				break;
			}

			String takahashi = sArray[i];
			String aoki = tArray[i];

			// right
			if (takahashi.equals("R")) {
				remainRight--;
				remainLeft++;
			}
			if (remainRight == 0) {
				isRemain = false;
				// System.out.println("break by remainRight ");
				break;
			}
			if (aoki.equals("L")) {
				if (remainLeft > 1) {
					remainRight++;
					remainLeft--;
				}
			}

			// down
			if (takahashi.equals("D")) {
				remainUp++;
				remainDown--;
			}
			if (remainDown == 0) {
				isRemain = false;
				// System.out.println("break by remainDown ");
				break;
			}
			if (aoki.equals("U")) {
				if (remainUp > 1) {
					remainUp--;
					remainDown++;
				}
			}
			// System.out.println("remainLeft " + remainLeft);
			// System.out.println("remainUp " + remainUp);
			// System.out.println("remainDown " + remainDown);
			// System.out.println("remainRight " + remainRight);
			// System.out.println();
		}

		System.out.println(isRemain ? "YES" : "NO");
	}

}