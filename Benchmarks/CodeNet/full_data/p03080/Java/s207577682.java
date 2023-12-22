import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String s = sc.next();

		int numR = 0;
		int numB = 0;

		for (int i = 0; i < n; i++) {
			String si = s.substring(i, i + 1);
			if (si.equals("B")) {
				numB++;
			} else {

				numR++;
			}
		}

		if (numR > numB) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
