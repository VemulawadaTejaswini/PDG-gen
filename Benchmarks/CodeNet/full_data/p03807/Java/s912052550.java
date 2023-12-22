import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if ((A % 2) == 1) {
				cnt++;
			}
		}
		sc.close();

		String ans = "NO";
		if ((cnt % 2) == 0) {
			ans = "YES";
		}
		System.out.println(ans);
	}
}
