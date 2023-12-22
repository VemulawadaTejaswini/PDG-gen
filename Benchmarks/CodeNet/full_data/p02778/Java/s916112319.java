import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.next().length();
		for (int i = 0; i < n; i++) {
			System.out.print("x");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
