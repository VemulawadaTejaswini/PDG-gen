import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();

		// 出力
		if ((X - A) > 0 && (X - A) <= B) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}
