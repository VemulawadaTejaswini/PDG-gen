import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, A, B;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		sc.close();

		System.out.println(Math.min(N*A, B));
	}

}