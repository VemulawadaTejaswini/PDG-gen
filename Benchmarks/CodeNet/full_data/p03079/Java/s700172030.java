import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A == B && B == C && A == C) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}

	}
}
