import java.util.Scanner;

public class Main {
	int f(int lAnimal, int cAnimal, char cAnswer) {
		if (cAnswer == 'o') {
			if (cAnimal == 0) {
				return (lAnimal + 1) % 2;
			} else {
				return lAnimal;
			}
		} else {
			if (cAnimal == 0) {
				return lAnimal;
			} else {
				return (lAnimal + 1) % 2;
			}
		}
	}

	void g(int[] ret) {
		int n = ret.length;
		for (int i = 0; i < n; i++) {
			if (ret[i] == 0) {
				System.out.print('W');
			} else {
				System.out.print('S');
			}
		}
		System.out.println();
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int[] ret = new int[n];
		ret[0] = 1; ret[1] = 1;
		for (int i = 2; i < n; i++) {
			ret[i] = f(ret[i - 2], ret[i - 1], s[i - 1]);
		}
		if (f(ret[n - 2], ret[n - 1], s[n - 1]) == ret[0]) {
			g(ret);
			return;
		}

		ret[0] = 1; ret[1] = 0;
		for (int i = 2; i < n; i++) {
			ret[i] = f(ret[i - 2], ret[i - 1], s[i - 1]);
		}
		if (f(ret[n - 2], ret[n - 1], s[n - 1]) == ret[0]) {
			g(ret);
			return;
		}

		ret[0] = 0; ret[1] = 1;
		for (int i = 2; i < n; i++) {
			ret[i] = f(ret[i - 2], ret[i - 1], s[i - 1]);
		}
		if (f(ret[n - 2], ret[n - 1], s[n - 1]) == ret[0]) {
			g(ret);
			return;
		}

		ret[0] = 0; ret[1] = 0;
		for (int i = 2; i < n; i++) {
			ret[i] = f(ret[i - 2], ret[i - 1], s[i - 1]);
		}
		if (f(ret[n - 2], ret[n - 1], s[n - 1]) == ret[0]) {
			g(ret);
			return;
		}
		System.out.println(-1);
}

	public static void main(String[] args) {
		new Main().run();
	}
}
