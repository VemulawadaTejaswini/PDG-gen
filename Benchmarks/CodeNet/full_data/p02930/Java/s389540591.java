import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] ans = new int[n][n];
		int level = 0;
		for(int i=0;i<(n/2)*2;i+=2) {
			level++;
			ans[i+1][i] = 1;
			for(int j=0;j<i;j++) {
				ans[i][j] = level;
				ans[i+1][j] = level;
			}
		}
		if(n%2==1) {
			level++;
			for(int j=0;j<n-1;j++) {
				ans[n-1][j] = level;
			}
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.print(ans[j][i]+" ");
			}
			System.out.println();
		}
		in.close();

	}

}
