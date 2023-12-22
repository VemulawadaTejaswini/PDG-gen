//package compilers;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
public class Main {
	private static Map<Integer,Boolean> map;
	private static List<Integer> ans;
    private static void dfs(int i, ArrayList<Integer>[] arr) {
    	if(map.containsKey(i))
    		return;
    	map.put(i,true);
		for(int j: arr[i]) {
			//System.out.println(j);
			dfs(j,arr);
		}
		ans.add(i);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		ArrayList<Integer> []arr=new ArrayList[n+1];
		int x,y;
		for(int i=1;i<=n;i++)
			arr[i]=new ArrayList();
		Map<Integer,Integer> ma=new HashMap();
		while(m>0) {
		       x=in.nextInt();
			   y=in.nextInt();
			   arr[x].add(y);
			   ma.put(x,y);
			   m--;
		}
		//Stack<Integer> s=new Stack();
		/*
		 * for(int i=1;i<=n;i++) { System.out.print(i + "-> "); for(int j:arr[i]) {
		 * System.out.print(j+ " "); } System.out.println(); }
		 */
		map=new HashMap();
		//s.push(1);
		 ans=new ArrayList();
		  for(int i=1;i<=n;i++) {
			  dfs(i,arr);
		}
		  int dp[]=new int[n];
		  Collections.reverse(ans);
		  
		  for(int i=1;i<ans.size();i++) {
			  for(int j=0;j<i;j++) {
				  if(arr[ans.get(j)].contains(ans.get(i)))
					  dp[i]=Math.max(dp[i],dp[j]+1);
			  }
		  }
		  
		  int max=0;
		  
		  for(int i=0;i<n;i++) {
			  //System.out.print(dp[i] + " ");
			  max=Math.max(max, dp[i]);
		  }
		  System.out.println(max);
		
		
		
	}

}
