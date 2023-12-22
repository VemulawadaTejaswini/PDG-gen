import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String s = sc.next();
		sc.next();
		System.out.println("A" +s.charAt(0) + "C");
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}