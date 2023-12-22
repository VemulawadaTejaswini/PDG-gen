import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String[] s = sc.next().split("");

		int R = 0;
		int B = 0;

		for (int i = 0; i < N; i++) {
			if (s[i].equals("R")) {
				R++;
			} else {
				B++;
			}
		}

		if (R > B) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}

	}
}
