import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if ((B - D) > 0 && (C<B)) {
			if ((A - C) > 0) {
				System.out.println(D - A);
			} else if ((C - A) > 0) {
				System.out.println(D - C);
			} else {
				System.out.println("0");
			}
		} else if ((D - B) > 0 && (C<B)) {
			if ((A - C) > 0) {
				System.out.println(B - A);
			} else if ((C - A) > 0) {
				System.out.println(B - C);
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}
	}

}
