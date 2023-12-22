import java.util.*;
import java.lang.*;

public class Main {
  
   public int dp(ArrayList<Integer>[] tree,int[] dp,int index) {
	   if(dp[index]!=-1) {
		   return dp[index];
	   }
	   Iterator<Integer> it=tree[index].iterator();
	   int max=0;
	   while(it.hasNext()) {
		   int v=it.next();
		   if(this.dp(tree, dp, v)+1>max) {
			   max=this.dp(tree, dp, v)+1;
		   }
	   }
	   dp[index]=max;
	   return max;
   }
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
        ArrayList<Integer>[] tree=new ArrayList[n];
        for(int i=0;i<n;i++) {
        	tree[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++) {
        	tree[sc.nextInt()-1].add(sc.nextInt()-1);
        }
        int[] dp=new int[n];
        for(int i=0;i<n;i++) {
        	dp[i]=-1;
        }
        Main mm=new Main();
        for(int i=0;i<n;i++) {
        mm.dp(tree, dp, i);}
        
        Arrays.sort(dp);
        System.out.println(dp[n-1]);
	}
}

