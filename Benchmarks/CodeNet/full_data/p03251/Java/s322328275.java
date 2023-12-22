
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] lineX = new int[N+1];
		int[] lineY = new int[M+1];


		for (int i = 0; i < N; i++) {
			lineX[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			lineY[i] = sc.nextInt();
		}

		Arrays.sort(lineX);
		Arrays.sort(lineY);

		if (lineX[lineX.length - 1] <lineY [0]) {
			System.out.print("No War ");
		} else {
			System.out.print("War");
		}


	}

}
