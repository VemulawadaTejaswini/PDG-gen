import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, K, D, E, max;
		A = sc.nextInt();
		B = sc.nextInt();
		D = Math.max(A, B);
		C = sc.nextInt();
		E = Math.max(D, C);
		K = sc.nextInt();
		for (int i = 0; i < K; i++) {
			E = E * 2;
		}
		max = A + B + E;
		System.out.println(max);
		sc.close();
	}

}
