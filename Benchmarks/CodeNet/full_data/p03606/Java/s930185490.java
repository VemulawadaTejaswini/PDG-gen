import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < N; i++) {
			ans = ans + r - l + 1;
		}

		System.out.println(ans);

	}
}