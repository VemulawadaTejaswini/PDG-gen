import java.util.*;
import java.io.*;

public class Main {

	long MOD = (long) 1e9+7;
	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] matrix = new int[N+1][N+1];
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		/*
		System.out.println("printing matrix");
		for(int i=1;i<=N;i++){
			System.out.println(Arrays.toString(matrix[i]));
		}*/

		int MAX_N = 21; // from question

		long [][] dp = new long [MAX_N+1][(1<<(MAX_N+1))];

		int womanSubset = (1<<N)-1;

		return solve(matrix, 1, womanSubset, dp, N);
	}

	private long solve(int[][] matrix, int i, int womanSubset, long [][]dp , int N) {

		
		

		if(i==(N+1)){
			//System.out.println("woman subset: " + womanSubset);	 
			if (womanSubset==0) return 1;
			else return 0;
		}

		if (dp[i][womanSubset]!=0) {
			//System.out.println("i: " + i+" womanSubset: "+womanSubset);	 	
			return dp[i][womanSubset];
		}
		//System.out.println("i: " + i+" N: "+N);	 	


		long answer = 0;
		for(int w=0;w<N;w++) {
			//System.out.println("(1<<w): " + (1<<w));
			//System.out.println("womanSubset: " + (womanSubset));
			//System.out.println("((1<<w) & womanSubset): " + ((1<<w) & womanSubset));
			boolean available  = ((1<<w) & womanSubset)!=0;
			//System.out.println("available: "+ available +" matrix: " + matrix[i][w+1]+" i:"+(i)+ " w+1: " + (w+1)); 
			if (available && matrix[i][w+1]==1) {
				int newWomanSubset = womanSubset^(1<<w);
				answer =  answer + solve(matrix, i+1, newWomanSubset, dp, N);
				answer %=MOD;
			}
		}

		dp[i][womanSubset] = answer;
		//System.out.println("set i: " + i+" womanSubset: "+womanSubset+" answer: "+ answer);	 	
		return answer;
	}
}