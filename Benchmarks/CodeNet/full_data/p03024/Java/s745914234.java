import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String[] strArray = s.split("");

		int winCount = 0;
		int k = strArray.length;

		for (int i = 0; i < k; i++) {
			String hoshi = strArray[i];

			if (hoshi.equals("o")) {
				winCount++;
			}
		}

		if ((15 - k) + winCount >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
