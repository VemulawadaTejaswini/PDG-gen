import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str;
		int[][] points = new int[n][3];
		for(int i=0; i<n; i++) {
			str = br.readLine().split(" ");
			points[i][0] = Integer.parseInt(str[0]);
			points[i][1] = Integer.parseInt(str[1]);
			points[i][2] = Integer.parseInt(str[2]);
		}
		int[][][] cost = new int[n+1][3][3];
		for(int i=1; i<=n; i++) {
			for(int j=0; j<3; j++) {
				int nt = (j+1)%3;
				int nnt = (j+2)%3;
				cost[i][j][0] = Math.max(points[i-1][nt]+Math.max(cost[i-1][nt][0], cost[i-1][nt][1]), 
										points[i-1][nnt]+Math.max(cost[i-1][nnt][0], cost[i-1][nnt][1]));
				cost[i][j][1] = points[i-1][j]+Math.max(Math.max(cost[i-1][nt][1], cost[i-1][nt][2]),
											Math.max(cost[i-1][nt][1], cost[i-1][nt][2]));
				//cost[i][j][2] = points[i-1][j]+cost[i-1][j][1];
				//System.out.print(cost[i][j][0]+"|"+cost[i][j][1]+"|"+cost[i][j][2]+" ");
			}
			//System.out.println();
		}
		int ans = -1;
		for(int j=0; j<3; j++) {
			for(int k=0; k<3; k++) {
				ans = Math.max(cost[n][j][k], ans);
			}
		}
		System.out.println(ans);
	}
}
