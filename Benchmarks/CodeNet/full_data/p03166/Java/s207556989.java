//package compilers;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Main {
	private static Map<Integer,Boolean> map;
	private static List<Integer> ans;
	private static int max=0;
	private static int dp[];
    private static int dfs(int i, Set<Integer>[] arr, int ma) {
    	if(map.containsKey(i))
    		return dp[i];
    	map.put(i,true);
    	int maxi=0;
		for(int j: arr[i]) {
			//System.out.println(j);
			maxi=Math.max(dfs(j,arr,ma)+1,maxi);
			max=Math.max(maxi,max);
		}
		dp[i]=maxi;
		return dp[i];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		Set<Integer> []arr=new Set[n+1];
		int x,y;
		for(int i=1;i<=n;i++)
			arr[i]=new HashSet();
		//Map<Integer,Integer> ma=new HashMap();
		while(m>0) {
		       x=in.nextInt();
			   y=in.nextInt();
			   arr[x].add(y);
			   m--;
		}
		//Stack<Integer> s=new Stack();
		/*
		 * for(int i=1;i<=n;i++) { System.out.print(i + "-> "); for(int j:arr[i]) {
		 * System.out.print(j+ " "); } System.out.println(); }
		 */
		map=new HashMap();
		//s.push(1);
		 dp=new int[n+1];
		 ans=new ArrayList();
		  for(int i=1;i<=n;i++) {
			  dfs(i,arr,0);
		}
		  
		  Collections.reverse(ans);
		  
		  for(int i=1;i<ans.size();i++) {
			  for(int j=0;j<i;j++) {
				  if(arr[ans.get(j)].contains(ans.get(i)))
					  dp[i]=Math.max(dp[i],dp[j]+1);
			  }
		  }
		  
		/*
		 * int max=0;
		 * 
		 * for(int i=0;i<n;i++) { //System.out.print(dp[i] + " "); max=Math.max(max,
		 * dp[i]); }
		 */
		  System.out.println(max);
		
		
		
	}

}
