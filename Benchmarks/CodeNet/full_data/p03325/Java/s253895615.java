import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			while (Ai % 2 == 0) {
				Ai /= 2;
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
