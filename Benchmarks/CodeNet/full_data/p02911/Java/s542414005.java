import java.util.Scanner;

//AtCoder Beginner Contest 141
//C	Attack Survival
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());

		int[] arrN = new int[N];
		for (int n = 0; n < N; n++) {
			arrN[n] = K;
		}
		for (int i = 0; i < Q; i++) {
			int a = Integer.parseInt(sc.next()) - 1;
			for (int n = 0; n < N; n++) {
				if (a != n) {
					arrN[n]--;
				}
			}
		}
		sc.close();

		for (int n = 0; n < N; n++) {
			if (arrN[n] <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
