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

		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

		if(X < Y) {
			int min = y[0];
			for(int i = 1; i < M; i++) {
				if(y[i] <= min) {
					min = y[i];
				}
			}

			if(min == X)	min++;
			int countx = 0;
			int county = 0;
			for(int i = 0; i < N; i++) {
				if(x[i] < min)	countx++;
			}
			for(int i = 0; i < M; i++) {				
				if(y[i] >= min) county++;
			}

			if(N == countx && county == 0) {
				System.out.println("No War");
			}else {
				System.out.println("War");
			}
		}else {
			System.out.println("War");
		}
	}
}
