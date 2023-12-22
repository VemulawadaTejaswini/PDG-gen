import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		int n = s.length;
		boolean N, E, W, S;
		N = E = W = S = false;
		for (int i = 0; i < n; i++) {
			if (s[i] == 'N') {
				N = true;
			}
			if (s[i] == 'E') {
				E = true;
			}
			if (s[i] == 'W') {
				W = true;
			}
			if (s[i] == 'S') {
				S = true;
			}
		}

		if (N == S && W == E) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
