import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if (B+C<A) {
			System.out.println(0);
		} else {
			System.out.println(B+C-A);
		}
	}
}