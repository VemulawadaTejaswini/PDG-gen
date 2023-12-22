import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		long inf = 1000000007;
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int k = in.nextInt();
		if(w==1) {
			System.out.println(1);
		}else {
			int[] fib = new int[w];
			fib[0] = 1;
			fib[1] = 2;
			for(int i=2;i<w;i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
			int[][] puttern = new int[w][3];
			puttern[0][0] = 0;
			puttern[0][1] = fib[w-2];
			puttern[0][2] = w-3>=0?fib[w-3]:1;
			for(int i=1;i<w-1;i++) {
				puttern[i][0] = (i-2>=0?fib[i-2]:1) * (w-i-2>=0?fib[w-i-2]:1);
				puttern[i][1] = (i-1>=0?fib[i-1]:1) * (w-i-2>=0?fib[w-i-2]:1);
				puttern[i][2] = (i-1>=0?fib[i-1]:1) * (w-i-3>=0?fib[w-i-3]:1);
			}
			puttern[w-1][0] = w-3>=0?fib[w-3]:0;
			puttern[w-1][1] = fib[w-2];
			puttern[w-1][2] = 0;
			
			long[][] dp = new long[h+1][w];
			dp[0][0] = 1;
			for(int i=0;i<h;i++) {
				dp[i+1][0] = (dp[i][0]*puttern[0][1]%inf + dp[i][1]*puttern[0][2]%inf)%inf;
				for(int j=1;j<w-1;j++) {
					dp[i+1][j] = (dp[i][j-1]*puttern[j][0]%inf + dp[i][j]*puttern[j][1]%inf + dp[i][j+1]*puttern[j][2]%inf)%inf;
				}
				dp[i+1][w-1] = (dp[i][w-2]*puttern[w-1][0]%inf + dp[i][w-1]*puttern[w-1][1]%inf)%inf;
			}
			System.out.println(dp[h][k-1]);
		}
		
		
		
	}

}
