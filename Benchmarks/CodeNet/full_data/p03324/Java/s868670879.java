import java.util.Scanner;

public class Main extends Thread implements Runnable {
	public static void main(String[] args) {

		Main main = new Main();
		main.run();
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A == 0) {
			if (B == 100) {
				System.out.println(B + 1);
			} else {
				System.out.println(B);
			}
		} else {
			if (B == 100) {
				if (A == 1) {
					System.out.println(B * 100 + 100);
				} else if (A == 2) {
					System.out.println(B * 100 + 1000000);
				}
			} else {
				if (A == 2) {
					System.out.println(B * 10000);
				} else {
					System.out.println(B * 100);
				}
			}
		}

	}
}