import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 結果の出力
		for (int i = 10; i < 1010; i++) {
			if (Math.floor(i * 0.08) == A) {
				if (Math.floor(i * 0.1) == B) {
					System.out.println(i);
					break;
				}
				else {
					continue;
				}
			}
			else {
				continue;
			}
		}
		System.out.println(-1);

		sc.close();
	}
}
