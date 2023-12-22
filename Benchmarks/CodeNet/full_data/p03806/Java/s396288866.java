import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int Ma = Integer.parseInt(sc.next());
		int Mb = Integer.parseInt(sc.next());

		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		//key is cost, value is id number.
		for(int i=0;i<N;i++) {
			a[i] = Integer.parseInt(sc.next());

			b[i] = Integer.parseInt(sc.next());

			c[i] = Integer.parseInt(sc.next());
		}
		sc.close();


		//using material from 0 to i, ratio is (a,b), mean cost.
		int[][][] dp = new int[N][10*N+1][10*N+1];
		for(int i=0;i<N;i++) {
			for(int j=0;j<10*N+1;j++) {
				for(int k=0;k<10*N+1;k++) {
					dp[i][j][k] = 10000;
				}
			}
		}
		dp[0][0][0] = 0;

		for(int i=0;i<N;i++) {
			for(int j=0;j<10*N+1;j++) {
				for(int k= 0;k<10*N+1;k++) {

					if(j-a[i] >= 0 && k-b[i] >= 0) {
						if(i!=0) {
							dp[i][j][k] = Math.min(dp[i][j][k], Math.min(dp[i-1][j][k], dp[i-1][j-a[i]][k-b[i]] + c[i]));
						}
						else{
							dp[i][a[i]][b[i]] = c[i];
						}
					}
					else {
						if(i!=0) {
							dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][j][k]);
						}
						else {
							dp[i][a[i]][b[i]] = c[i];
						}
					}
				}
			}
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int j=1;j<10*N+1;j++) {
			for(int k=1;k<10*N+1;k++) {
				if(j*Mb==k*Ma) {
					queue.add(dp[N-1][j][k]);
				}
			}
		}
		int result = queue.poll();
		if(result < 10000) {
			out.println(result);
		}
		else {
			out.println(-1);
		}
		out.flush();
	}
}