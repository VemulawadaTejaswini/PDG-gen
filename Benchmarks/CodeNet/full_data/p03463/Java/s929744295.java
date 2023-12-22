import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (N % 2 == 0) {
			if (A + B % 2 != 0) {
				System.out.println("Borys");
			} else {
				System.out.println("Alice");
			}
		} else {
			if (A + B % 2 != 0) {
				System.out.println("Alice");
			} else {
				System.out.println("Borys");
			}
		}
	}
}