import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(n * (n + 1) / 2);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
