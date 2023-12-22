import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int[] num =new int[N];
		Arrays.fill(num, -1);
		boolean ableFlg = true;

		for (int i = 0; i < M; i++) {
			int insert = sc.nextInt();
			int number = sc.nextInt();

			if (insert == 1 && number == 0) {
				ableFlg = false;
				break;
			}

			if (num[insert - 1] != -1 && num[insert - 1] != number) {
				ableFlg = false;
				break;
			}

			num[insert - 1] = number;

		}

		if (ableFlg) {
			for (int i = 0; i < N; i++) {
				if (num[0] == -1) {
					num[0] = 1;
				}

				if (num[i] == -1) {
					System.out.print(0);
				}else {
					System.out.print(num[i]);
				}
			}
		}else {
			System.out.println(-1);
		}

	}
}