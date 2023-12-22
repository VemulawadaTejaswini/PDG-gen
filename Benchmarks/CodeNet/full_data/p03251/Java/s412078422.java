import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] xn = new int[N+1];
		xn[0] = X;
		for(int i=1;i<=N;i++) {
			xn[i] = sc.nextInt();
		}

		int[] ym = new int[M+1];
		ym[0] = Y;
		for(int i=1;i<=M;i++) {
			ym[i] = sc.nextInt();
		}

		Arrays.sort(xn);
		Arrays.sort(ym);

		if (xn[N]<ym[0]) {
			System.out.print("No War");
		} else {
			System.out.print("War");
		}

	}
}