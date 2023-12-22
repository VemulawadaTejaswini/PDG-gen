

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int AB = A + B;

		int c = 0;

		if (N % AB > A)
			c = A;
		else
			c = N % AB;

		System.out.println(A * N / AB + c);

	}

}
