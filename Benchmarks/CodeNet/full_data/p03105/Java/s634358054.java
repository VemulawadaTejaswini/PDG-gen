import java.util.Scanner;

public class favoriteSound {
	public static void main(String[] args) {
		// 入力値を取得
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 満足度満たすか否か
		int smile = 0;
		smile = b >= a * c ? c : b / a;
		// 出力
		System.out.println(smile);
		// クローズ
		sc.close();
	}

}