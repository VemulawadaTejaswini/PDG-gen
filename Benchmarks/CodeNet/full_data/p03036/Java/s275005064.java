import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int r = sc.nextInt();
		int D = sc.nextInt();
		int X[] = new int[10];
		X[0] = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			X[i] = X[i - 1] * r + D;
			System.out.println(X[i]);
		}
		sc.close();
	}
};