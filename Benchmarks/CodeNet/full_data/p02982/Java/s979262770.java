import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int ans =0;
		Main main = new Main();

		int[][]list = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				list[i][j]= sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (i==j) {
					continue;
				}else {
					long con =0;
					for (int k = 0; k < D; k++) {
						con+=Math.pow(Math.abs(list[i][k] - list[j][k]), 2);
					}
					if (main.chkSquearNum(con)) {ans++;}
				}
			}
		}

		System.out.println(ans);

	}

	public boolean chkSquearNum(long N) {
		if (N<0) {
			throw new IllegalArgumentException();
		}

		double sqrtNum = Math.sqrt(N);
		return isLong(sqrtNum);
	}

	public boolean isLong(double N) {
		return (N == Math.floor(N));
	}
}

