import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A == 1) {
			A = 14;
		}
		if (B == 1) {
			B = 14;
		}
		if (A > B) {
			System.out.println("Alice");
			return;
		}
		if (B > A) {
			System.out.println("Bob");
			return;
		} if(A == B) {
			System.out.println("Draw");
		}
	}
}