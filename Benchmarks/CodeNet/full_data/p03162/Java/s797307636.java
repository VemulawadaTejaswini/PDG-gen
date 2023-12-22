
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] A = new int[N][3];

		for(int i = 0 ; i < N ; i++){
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
			A[i][2] = sc.nextInt();

		}
		sc.close();

		long[][] cost = new long[N][3];
		cost[0][0] = A[0][0];
		cost[0][1] = A[0][1];
		cost[0][2] = A[0][2];

		System.out.println(dfs(0,N-1,cost,A));
	}
	static long dfs(int a,int b,long[][] c,int[][] d){
		if(a == 0){
			return dfs(1,b,c,d);
		}
		else if(b==0){
			return Math.max(Math.max(d[b][1], d[b][2]),d[b][0]);
		}
		else{
			d[a][0] = d[a][0] + Math.max(d[a-1][1],d[a-1][2]);
			d[a][1] = d[a][1] + Math.max(d[a-1][0],d[a-1][2]);
			d[a][2] = d[a][2] + Math.max(d[a-1][0],d[a-1][1]);

			if(a == b){
				return Math.max(d[a][0],Math.max(d[a][1], d[a][2]));
			}
			else{
				return dfs(a+1,b,c,d);
			}
		}
	}
}