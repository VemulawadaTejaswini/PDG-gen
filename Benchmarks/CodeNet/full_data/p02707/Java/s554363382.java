import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A = 0;
		int[] B = new int[N+1];
		for (int i = 2; i < N+1; i++) {
			A = scan.nextInt();
			B[A]++;
		}

		for (int i = 1; i < N+1; i++) {
			System.out.println(B[i]);
		}

	}

}