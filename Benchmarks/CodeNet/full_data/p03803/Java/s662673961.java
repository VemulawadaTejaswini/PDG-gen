import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == 1 && B == 1) {
			System.out.println("Draw");
		}else if(A == 1) {
			System.out.println("Alice");
		}else if(B == 1) {
			System.out.println("Bob");
		}else {
			if(A > B) System.out.println("Alice");
			else if(A == B) System.out.println("Draw");
			else System.out.println("Bob");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}