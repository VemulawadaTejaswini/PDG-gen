import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		for (int i = 0; i <= N; i++) {
			int target = i;
			int sum = 0;
			while (target != 0) {
				sum += target % 10;
				target /= 10;
			}
			if (sum >= A && sum <= B) {
				ans += i;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}