import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int N = scanner.nextInt();
		
      	//1以上９以下の場合
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				if (N == a * b) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}