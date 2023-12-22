import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] points = new int[n+1][3];
		for(int i=1;i<=n;i++){
		    points[i][0] =scn.nextInt();
		    points[i][1] =scn.nextInt();
		    points[i][2] =scn.nextInt();
		}
		// System.out.println(maxHappiness(1,points,-1));
		int[][] memo = new int[n+1][3];
		System.out.println(maxHappiness_memoized(1,points,-1,memo));

	}


    public static int maxHappiness_memoized(int day, int[][] points , int activityOnPrevDay,int[][] memo) {
    		if(day==points.length)return 0;
      		if(activityOnPrevDay!=-1 && memo[day][activityOnPrevDay]!=0)return memo[day][activityOnPrevDay];
    		int ans = Integer.MIN_VALUE;
    		for (int i = 0; i < 3; i++) {
    			if (i != activityOnPrevDay) {
    				int ca = points[day][i] + maxHappiness_memoized(day + 1, points, i,memo);
    				ans = Math.max(ans, ca);
    			}
    		}
    		if(activityOnPrevDay!=-1)
    		    memo[day][activityOnPrevDay]=ans;
    		return ans;
    }
}
