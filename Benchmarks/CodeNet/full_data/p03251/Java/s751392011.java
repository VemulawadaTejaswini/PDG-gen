import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[M];
		int z1 = X;
		int z2 = Y;
		for(int i=0; i<N; i++) {
			x[i] = sc.nextInt();
			z1 = Math.max(z1, x[i]);
		}
		for(int i=0; i<M; i++) {
			y[i] = sc.nextInt();
			z2 = Math.max(z2, y[i]);
		}
		sc.close();
		System.out.println(z1 < z2 ? "No War":"War");
	}

}