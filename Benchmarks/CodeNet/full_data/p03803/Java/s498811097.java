import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A == 1 && B == 13) {
			System.out.println("Alice");
		} else if(A == 13 && B == 1) {
			System.out.println("Bob");
		} else if(A > B) {
			System.out.println("Alice");
		} else if(A < B ) {
			System.out.println("Bob");
		} else {
			System.out.println("Draw");
		}
		scan.close();
	}

}
