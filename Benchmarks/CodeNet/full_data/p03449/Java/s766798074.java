
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[2][n];
		int sum[][] = new int[2][n+1];
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				a[i][j]=sc.nextInt();
				sum[i][j+1]=sum[i][j]+a[i][j];
			}
		}
		int max=0;
		for(int i=1; i<=n; i++) {
			max = Math.max(max, sum[0][i] + sum[1][n] - sum[1][i-1]);
		}
		System.out.println(max);
		sc.close();
	}
}
