import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		if (c < 10) {
			System.out.println(c);
		} else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
