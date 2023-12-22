
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];

		for(int i = 0 ; i < N ; i++){
			A[i] = sc.nextInt();
		}
		sc.close();

		long[] cost = new long[N];
		cost[0] = 0;

		System.out.println(dfs(0,N-1,K,cost,A));

	}
	static long dfs(int a,int b,int c,long[] cost,int[] A){
		if(a == 0){
			return dfs(1,b,c,cost,A);
		}
		else{
			int p = Math.min(a, c);
			long tmp = 1000000000;
			for(int i = 1 ; i <= p ; i++){
				tmp = Math.min(tmp,cost[a-i] + Math.abs(A[a-i]-A[a]));
			}
			cost[a] = tmp;

			if(a == b){
				return cost[a];
			}
			else{
				return dfs(a+1,b,c,cost,A);

			}


		}
	}
}