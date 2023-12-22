import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] data = new int[n][m];
		int[] ans = new int[m];
		int anscount = 0;

		for (int i = 0;i<m ;i++ ) {
			ans[i]= i+1;
		}

		for (int i = 0;i<n ;i++ ) {
			int k = sc.nextInt();
			for (int j = 0;j<k ;j++ ) {
				data[i][j] = sc.nextInt();
			}
		}

		for (int k = 0;k<m ;k++ ) {
			int count = 0;
			for (int i = 0;i<n ;i++ ) {
				for (int j = 0;j<m ;j++ ) {
					if (data[i][j]==ans[k]) {
						count++;
					}
				}
			}
			if (count==n) {
				anscount++;
			}
		}


		System.out.println(anscount);
	}
}
