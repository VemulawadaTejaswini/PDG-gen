import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] X = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int tmp = 0;
				for (int k = 0; k < D; k++) {
					int m = (int) Math.pow(X[i][k] - X[j][k], 2);
					tmp += m;
				}
				if (isSquareNumber(tmp)) {
					ans++;
				}
			}
		}

		System.out.println(ans);
	}

	// 平方数かどうかを調べる。
	public static boolean isSquareNumber(int number) {
		double sqrtOfNumber = Math.sqrt(number);
		return (isInteger(sqrtOfNumber));
	}

	// 整数かどうかを調べる。
	public static boolean isInteger (double number) {
			return (number == Math.floor(number));
	}
}
