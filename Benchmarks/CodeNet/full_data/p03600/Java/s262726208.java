import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] saitanro = new long[n][n];
//		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				saitanro[i][j] = sc.nextLong();
//				sum += saitanro[i][j];
			}
		}
//		sum /= 2;
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(saitanro[i][j] > saitanro[i][k]+saitanro[k][j]) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean nec = true;
				for (int k = 0; k < n; k++) {
					if (i != k && j != k && saitanro[i][k] + saitanro[k][j] == saitanro[i][j]) {
						nec = false;
					}
				}
				if(nec) ans += saitanro[i][j];
			}
		}
		System.out.println(ans/2);
	}
}