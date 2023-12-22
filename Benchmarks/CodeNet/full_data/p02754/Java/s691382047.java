import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N;
		int A;
		int B;
		int X;
		int mod;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		X = N / (A + B);
		mod = N % (A + B);
		System.out.println(X * A + Math.min(mod, A));
		sc.close();
	}

}