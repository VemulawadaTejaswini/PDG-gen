import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt() ;
		int[][] a = new int[2][n];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		int sum = 0;
		for(int i = 0; i <  n; i++) {
			for(int j = 0; j <= i; j++) {
				sum += a[0][j];
			}
			for(int k = n - 1; k >= i; k--) {
				sum += a[1][k];
			}
			if(sum>max) {
				max = sum;
			}
			sum = 0;
		}
		System.out.println(max);

	}
}
