import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		sc.next();
		char c = sc.next().toCharArray()[0];
		sc.next();

		System.out.println("A" + c + "C");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
