import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];

		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++){
			int checksum = 0;
			for (int j = 0; j < n; j++) {
				if (j == i) {
					checksum += a[0][j] + a[1][j];
				} else if (j < i) {
					checksum += a[0][j];
				} else {
					checksum += a[1][j];
				}
			}
			max = Math.max(max, checksum);
		}
		System.out.println(max);



	}

}
