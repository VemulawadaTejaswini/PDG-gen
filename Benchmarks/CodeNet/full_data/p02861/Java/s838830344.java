import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}

		double total = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int disX = (int) Math.pow(X[i] - X[j], 2);
				int disY = (int) Math.pow(Y[i] - Y[j], 2);
				total += Math.pow(disX + disY, 0.5);
			}
		}

		System.out.println(total / N);

	}

}