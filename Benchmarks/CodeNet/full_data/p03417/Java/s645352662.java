import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		if (N >= 3 && M >= 3)
			System.out.println((N - 2) * (M - 2));
		else if (N == 2 || M == 2)
			System.out.println(0);
		else
			System.out.println(N == 1 ? M - 2 : N - 2);
	}
}