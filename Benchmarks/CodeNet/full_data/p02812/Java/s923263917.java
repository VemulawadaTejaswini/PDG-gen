import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		String S = sc.next();
		
		// 結果の出力
		int count = 0;
		while (S.indexOf("ABC") >= 0) {
			count++;
			S = S.substring(S.indexOf("ABC") + 3);
		}
		System.out.println(count);
		
		sc.close();
	}
}
