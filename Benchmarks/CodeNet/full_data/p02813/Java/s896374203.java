import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			q[i] = sc.nextInt();
		}

		System.out.println(Math.abs(searchCount(p) - searchCount(q)));
		sc.close();
	}

	public static int searchCount(int[] orderArr) {

		int len = orderArr.length;
		ArrayList<Integer> usedList = new ArrayList<Integer>();
		int count = 0;

		for (int i = 1; i <= len; i++) { // 桁数
			for (int j = 1; j <= len; j++) { // 注目している桁の値
				if ((orderArr[i - 1] > j) && (!usedList.contains(j))) {
					count += factorial(len - i);
				} else if (orderArr[i - 1] == j) {
					usedList.add(j); // 使った値を記録しておく
				}
			}
		}
		return count + 1;
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
