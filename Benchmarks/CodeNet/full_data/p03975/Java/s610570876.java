import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			int T = sc.nextInt();
			if (T < A || B <= T) ++ans;
		}
		System.out.println(ans);
	}

}
