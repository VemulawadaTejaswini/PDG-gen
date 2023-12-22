import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int free = 0;
		int freeB = 0;

	    free = A;
		A = B;
		B = free;
		freeB = A;
		A = C;
		C = freeB;

		System.out.println(A + " " + B + " " +C);
	}
}