import java.util.*;
import java.util.Map.Entry;

import hakerrank.solve_linear_equations;

import java.io.*;

public class Main {
static int mod=(int)1e9+7;
static long dp[];
static long score[];
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		long mat[][]=new long[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=scn.nextLong();
			}
		}
		dp=new long[(1<<n)+1];
		Arrays.fill(dp, Integer.MIN_VALUE/2);
		score=new long[(1<<n)+1];
		for(int i=0;i<(1<<n);i++){
			long sc=0;
			for(int j=0;j<n;j++){
				for(int k=j+1;k<n;k++){
					if(((1<<j)&i)!=0 && ((1<<k)&i)!=0){
						sc+=mat[j][k];
					}
				}
			}
			score[i]=sc;
		}
		long ans=solve((1<<n)-1);
		System.out.println(ans);
		
		
		
		
		


	}
private static long solve(int mask) {
	if(mask==0){
		return 0;
	}
	if(dp[mask]!=Integer.MIN_VALUE/2){
		return dp[mask];
	}

	long res=0;

	for(int submask=mask;submask!=0;submask=(submask-1)&mask){
		
		res=Math.max(res, score[submask]+solve(submask^mask));
	}
	
	
	
	return dp[mask]=res;
}

}