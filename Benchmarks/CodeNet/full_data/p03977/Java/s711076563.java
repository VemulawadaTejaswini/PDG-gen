import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int i = 0; i < T; ++i) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int ans = (N - 1) * 127 + (N % 2 == 0 ? (D ^ 127) : D);
			System.out.println(ans);
		}
	}

}
