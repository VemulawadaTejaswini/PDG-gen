import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= N; i += 2) {
			if (f(i))
				++ans;
		}
		System.out.println(ans);
	}

	boolean f(int n) {
		int cnt = 0;
		for (int i = 1; i <= n; ++i) {
			if (n % i == 0)
				++cnt;
		}
		return cnt == 8;
	}
}