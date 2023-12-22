import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int D = sc.nextInt();
		// スペース区切りの整数の入力
		int N = sc.nextInt();

		sc.close();

		if (D == 0) {
			if (N == 100)
				N = 101;
			System.out.println(N);
		} else if (D == 1)
			System.out.println(N * 100);
		else if (D == 2)
			System.out.println(N * 10000);

	}
}