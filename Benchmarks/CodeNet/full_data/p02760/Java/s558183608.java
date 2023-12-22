import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int[][] array = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();

		for (int h = 0; h < N; h++) {
			int number = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (array[i][j] == number) {
						array[i][j] = 0;
					}
				}
			}
		}
		sc.close();

		boolean flag = false;

		for (int i = 0; i < 3; i++) {
			int line1 = 0;
			int row1 = 0;

			for (int j = 0; j < 3; j++) {
				line1 += array[i][j];
				row1 += array[j][i];
			}

			if (line1 == 0 || row1 == 0) {
				flag = true;
			}
			row1 = 0;
			line1 = 0;
		}

		for (int i = 0; i < 3; i++) {
			int line1 = 0;
			int row1 = 0;

			for (int j = 0; j < 3; j++) {
				line1 += array[i][i]; // [you] 左斜めの足し算
				row1 += array[2 - i][i]; // [you] 右斜めの足し算
			}

			if (line1 == 0 || row1 == 0) {
				flag = true;
			}
			row1 = 0;
			line1 = 0;
		}



		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
