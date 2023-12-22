import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 結果の出力
		System.out.println((N * (N-1) / 2) + (M * (M-1) / 2));

		sc.close();
	}
}
