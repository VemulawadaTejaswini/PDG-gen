import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a + b) % 24);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
