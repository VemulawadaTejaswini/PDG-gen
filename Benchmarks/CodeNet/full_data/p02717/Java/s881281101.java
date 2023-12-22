import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int a = A;
		A = B;
		B = a;

		int c = C;
		C = A;
		A = c;
		System.out.print(A + " ");
		System.out.print(B + " ");
		System.out.print(C);

	}

}
