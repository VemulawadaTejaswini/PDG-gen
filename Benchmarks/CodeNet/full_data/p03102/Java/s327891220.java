import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, c;
		n = sc.nextInt(); m = sc.nextInt(); c = sc.nextInt();
		int b[] = new int[m];
		for(int i = 0; i < m; ++i) b[i] = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			int sum = c;
			for(int j = 0; j < m; ++j) sum += a[i][j]*b[j];
			
			if(sum > 0) ++ans;
		}
		
		System.out.println(ans);
	}
}
