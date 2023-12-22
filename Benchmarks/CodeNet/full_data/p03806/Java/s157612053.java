import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int a[];
	int b[];
	int c[];
	int n;
	int ma;
	int mb;
	final int INF = 1001001001;
	final int MMAX = 401;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		ma=sc.nextInt();
		mb=sc.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}

		int dp[][][] = new int[n+1][MMAX][MMAX];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<MMAX; j++) {
				for(int k=0; k<MMAX; k++) {
					dp[i][j][k]=INF;
				}
			}
		}

		dp[0][0][0]=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<MMAX; j++) {
				for(int k=0; k<MMAX; k++) {
					dp[i+1][j][k] = Math.min(dp[i+1][j][k], dp[i][j][k]);
					if(j+a[i]<MMAX && k+b[i]<MMAX) {
						dp[i+1][j+a[i]][k+b[i]] = Math.min(dp[i+1][j+a[i]][k+b[i]], dp[i][j][k]+c[i]);
					}
				}
			}
		}
		int ans = INF;
		for(int i=0; i<n; i++) {
			for(int j=1; j<MMAX; j++) {
				for(int k=1; k<MMAX; k++) {
					if(j*mb == k*ma) {
						ans = Math.min(ans, dp[i][j][k]);
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
