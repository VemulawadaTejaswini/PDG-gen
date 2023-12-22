import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		boolean isExists = false;

		ArrayList<Integer> arrN = new ArrayList<Integer>();

		for (int i = 1; i < n + 1; i++) {
			arrN.add(i);
		}

		Collections.sort(arrN);

		for (int i = 0; i < arrN.size(); i = i + 2) {
			cnt++;

			if (cnt == k) {
				isExists = true;
			}
		}

		if (isExists) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}
