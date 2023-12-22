import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// Nが条件に合致するかどうかのフラグ
		boolean flg = false;

		// i * j = N となるようなi,jを全探索する
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j == N) {
					flg = true;
					break;
				}
			}
			if (flg) {
				break;
			}
		}
		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}