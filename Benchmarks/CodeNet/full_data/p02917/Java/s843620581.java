import java.util.Scanner;

//AtCoder Beginner Contest 140
//C	Maximal Value
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] bList = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			bList[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int ans = 0;
		for (int i = N - 2; i >= 0; i--) {
			if (i == N - 2) {
				ans += bList[i];
			} else {
				if (bList[i] < bList[i + 1]) {
					ans += bList[i];
				} else {
					ans += bList[i + 1];
				}
			}
		}
		ans += bList[0];

		System.out.println(ans);
	}
}
