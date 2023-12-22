/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int maxWeight = scn.nextInt();
		int[][] itemvaw = new int[n+1][2];
		
		for(int i=1;i<=n;i++){
		    itemvaw[i][0] = scn.nextInt();
		    itemvaw[i][1] = scn.nextInt();
		}
		System.out.println(knapsack_dp(itemvaw,maxWeight));
	}
	
	public static long knapsack_dp(int[][] itemvaw, int capacity) {
		int n = itemvaw.length - 1;
		long[][] memo = new long[n + 1][capacity + 1];
		for (int cii = n; cii > 0; cii--) {
			for (int capacityLeft = capacity; capacityLeft > 0; capacityLeft--) {
				if (cii == n) {
					memo[cii][capacityLeft] = capacityLeft >= itemvaw[cii][0] ? itemvaw[cii][1] : 0;
					continue;
				}
				long o1 = capacityLeft - itemvaw[cii][0] >= 0 ?
				          itemvaw[cii][1] + memo[cii + 1][capacityLeft - itemvaw[cii][0]] : Integer.MIN_VALUE;
				// knapsack_memoized(cii + 1, itemvaw, capacityLeft - itemvaw[cii][0], memo)
				long o2 = memo[cii + 1][capacityLeft];
				// knapsack_memoized(cii + 1, itemvaw, capacityLeft, memo);
				memo[cii][capacityLeft] = Math.max(o1, o2);
			}
		}
		return memo[1][capacity];
	}
}
