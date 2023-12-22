import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if (B > D) {
			if (A > C) {
				System.out.println(D-A);
			} else {
				System.out.println(D-C);
			}
		} else {
			if (A > C) {
				System.out.println(B-A);
			} else {
				System.out.println(B-C);
			}

		}
	}

}
