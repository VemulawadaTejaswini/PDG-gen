import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
            B[i] = Integer.parseInt(sc.next());
        }
        final int INF = 1001001001;
        int dp[][] = new int[n+1][h+1];
        for(int i=0; i<n; i++) {
        	for(int j=0; j<=h; j++) {
        		dp[i][j]=INF;
        	}
        }
        for(int i=0; i<n; i++) {
        	dp[i][0]=0;
        }
        for(int i=0; i<n; i++) {
        	for(int j=0; j<=h; j++) {
        		if(A[i]<=j) {
        			dp[i+1][j] = Math.min(dp[i+1][j-A[i]]+B[i], dp[i][j]);
        		}else {
        			dp[i+1][j] = Math.min(B[i], dp[i][j]);
        		}
        	}
        }
        System.out.println(dp[n][h]);
		sc.close();
	}
}
