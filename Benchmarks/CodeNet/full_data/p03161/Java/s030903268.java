import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(frog1(arr,k));
		
		
	}
	public static int frog1(int[] heights,int k) {
		
		int[] dp=new int[heights.length];
		dp[0]=0;
		dp[1]=Math.abs(heights[0]-heights[1]);
		
		int min=0;
		for(int vidx=2;vidx<heights.length;vidx++) {
			min=Integer.MAX_VALUE;
			for(int j=vidx-k;j<vidx;j++) {
				if((j)<0) {
					continue;
				}
		
				int val=Math.abs(heights[vidx]-heights[j])+dp[j];
				
				if(min>val) {
					min=val;
					dp[vidx]=min;
				}
				
			}
			
			
		}
		
		return dp[heights.length-1];
			
	}

}
