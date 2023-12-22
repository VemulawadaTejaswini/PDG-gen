
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int q=sc.nextInt();
		int lr[][] = new int[n][n];

		for(int i=0; i<m; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			l--;r--;
			lr[l][r]++;
		}

		int sum[][] = new int[n+1][n+1];
		sum[0][0]=0;
		for(int l=0; l<n; l++) {
			for(int r=0; r<n; r++) {
				sum[l+1][r+1] = sum[l+1][r] + sum[l][r+1] - sum[l][r] + lr[l][r];
			}
		}

		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans = sum[r][r] - sum[r][l-1] - sum[l-1][r] + sum[l-1][l-1];
			System.out.println(ans);
		}
		sc.close();
	}


}
