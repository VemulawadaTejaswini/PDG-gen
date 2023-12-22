import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int count = 0;

		for (int i = 1; i < N; i++) {
			int P = sc.nextInt();

			if (P != i) {
				count++;
			}

		}
      	//2回以上繰り返したら
		if (count >= 2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}