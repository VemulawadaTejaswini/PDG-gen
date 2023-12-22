import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int[][] X = new int[N][D];

		for (int n = 0; n < N; n++) {
			for (int d = 0; d < D; d++) {
				X[n][d] = scan.nextInt();
			}
		}
		scan.close();

		int res = 0;

		for(int y=0; y<N; y++) {
			for(int z=y+1; z<N; z++) {
				double distance2 = 0;
				for(int d=0; d<D; d++) {
					int yy = X[y][d];
					int xx = X[z][d];
					distance2+= Math.pow(X[y][d] - X[z][d], 2);
				}
				if(Math.sqrt(distance2) == Math.floor(Math.sqrt(distance2))) {
					res++;
				}
			}
		}
		System.out.println(res);
	}

}