import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		if (B - A < K) {
			for (int i = A; i < A + K; i++) {
				if (A <= i && i <= B) {
					System.out.println(i);
				}
			}
			for (int i = B - K + 1; i < B + 1; i++) {
				if (A <= i && i <= B) {
					System.out.println(i);
				}
			}
		} else {
			for (int i = A; i <= B; i++) {
				System.out.println(i);
			}
		}
	}

}
