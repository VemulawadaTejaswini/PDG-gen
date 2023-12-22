/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    static int[][] mainTable, dp;
    static int n;
    
    static int solve(int day, int activity)
    {
        //base case:
        if(day==n-1)
            return mainTable[day][activity];
            
        
        if(activity==0)
        {
            if(dp[day][activity]==0)
            {
                int temp1 = Math.max(solve(day + 1, 1) + mainTable[day][0], solve(day + 1, 2) + mainTable[day][0]);
                dp[day][activity] = temp1;
                return temp1;
            }
            else
                return dp[day][activity];
        }
            
        else if(activity==1)
        {
            if(dp[day][activity]==0)
            {
                int temp2 = Math.max(solve(day + 1, 0) + mainTable[day][1], solve(day + 1, 2) + mainTable[day][1]);
                dp[day][activity] = temp2;
                return temp2;
        
            }
            else
                return dp[day][activity];
        }
            
        else
        {
            if(dp[day][activity]==0)
            {
                int temp3 = Math.max(solve(day + 1, 0) + mainTable[day][2], solve(day + 1, 1) + mainTable[day][2]);
                dp[day][activity] = temp3;
                return temp3;
            }
            else
                return dp[day][activity];
        }
            
    }
    
	public static void main (String[] args) {
	    
	    Scanner scn = new Scanner(System.in);
		
		n = scn.nextInt();
	    
	    mainTable = new int[n][3];
	    dp = new int[n][3];
	    
	    for(int i = 0; i<n; i++)
	    {
	        mainTable[i][0] = scn.nextInt();
	        mainTable[i][1] = scn.nextInt();
	        mainTable[i][2] = scn.nextInt();
	    }
	    
	    int temp = Math.max(solve(0,0), Math.max(solve(0,1), solve(0, 2)));
		System.out.println(temp);
	}
}