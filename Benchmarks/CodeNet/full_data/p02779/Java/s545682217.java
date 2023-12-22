import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		HashSet<Integer> A = new HashSet<>();
		
		// 結果の出力
		for (int i = 0; i < N; i++) {
			if (!A.add(sc.nextInt())) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
		sc.close();
	}
}
